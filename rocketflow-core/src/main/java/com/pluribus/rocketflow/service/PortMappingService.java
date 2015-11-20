package com.pluribus.rocketflow.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

/**
 * Loads the port-mapping.csv from the classpath. Provides the service to query the PortMappingEntry
 * by the combination of protocol and port.
 *
 * @author jamie
 *
 */
public class PortMappingService {
	private static Logger logger = Logger.getLogger(PortMappingService.class);

	/**
	 * The port mapping entry in the hashmap.
	 *
	 * @author jamie
	 *
	 */
	public static class PortMappingEntry {
		String service = "";
		int port = -1;
		String proto = "";

		public PortMappingEntry(String service, int port, String proto) {
			this.service = service;
			this.port = port;
			this.proto = proto;
		}

		public String getService() {
			return service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		public String getProto() {
			return proto;
		}

		public void setProto(String proto) {
			this.proto = proto;
		}

		/**
		 * Returns the hash key.
		 * @return
		 */
		public String getKey() {
			return PortMappingEntry.getKey(this.proto, this.port);
		}

		@Override
		public String toString() {
			return "PortMappingEntry [service=" + service + ", port=" + port + ", proto=" + proto + "]";
		}

		public static String getKey(String protocol, int port) {
			return protocol + "_" + port;
		}
	}

	public PortMappingService() throws IOException {
		// Load the iana port mapping.
		loadMap("/port-mapping.csv");

		// Load the big data port mapping. The later will override the previous.
		loadMap("/big-data-port-mapping.csv");
	}

	/**
	 * Gets the port mapping entry.
	 * @param protocol the protocol
	 * @param port the port number
	 * @return The port mapping entry. null if not found.
	 */
	public PortMappingEntry getPortMapping(int protocol, int port) {
		switch (protocol) {
		case 6:
			return getPortMapping("tcp", port);
		default:
			return null;
		}
	}

	/**
	 * Gets the port mapping entry.
	 *
	 * @param protocol the protocol
	 * @param port the port number
	 * @return The port mapping entry. null if not found.
	 */
	public PortMappingEntry getPortMapping(String protocol, int port) {
		String key = PortMappingEntry.getKey(protocol, port);
		return hmPorts.get(key);
	}

	/**
	 * The map of the port key to the port mapping entry.
	 */
	private HashMap<String, PortMappingEntry> hmPorts = new HashMap<String, PortMappingEntry>();

	/**
	 * Loads the mapping file from classpath.
	 * @param file the filename in the classpath.
	 * @throws IOException
	 */
	private void loadMap(String file) throws IOException {
		logger.info("Loading port mapping from " + file);
		InputStream is = PortMappingService.class.getResourceAsStream(file);
		int count = 0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (!line.startsWith(",")) {
					try {
						StringTokenizer st = new StringTokenizer(line, ",");
						String service = st.nextToken();
						String port = st.nextToken();
						String proto = st.nextToken();
						if ((service.length() > 0) && (port.length() > 0) && (proto.length() > 0)) {
							int portNumber = Integer.parseInt(port);
							PortMappingEntry pme = new PortMappingEntry(service, portNumber, proto);
							hmPorts.put(pme.getKey(), pme);
							count++;
						}
					} catch (Exception nfex) {
						// Skip
					}

				}
			}
		}
		logger.info("Mapping loaded. Total entries=" + count);
	}

}
