package com.pluribus.rocketflow.service;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public class DnsService {
	public Map<String, String> hostMap = new HashMap<String, String>();

	public String lookupHostname(String ip) throws UnknownHostException {
		return ip;
	}

	public String _lookupHostname(String ip) throws UnknownHostException {
		String hostname = hostMap.get(ip);
		if (hostname == null) {
			InetAddress addr = InetAddress.getByName(ip);
			hostname = addr.getHostName();
			if (hostname != null) {
				hostMap.put(ip, hostname);
			}
		}

		return hostname;
	}

	public String lookupHostname(InetAddress addr) {
		return _lookupHostname(addr);
	}

	public String _lookupHostname(InetAddress addr) {
		try {
			String hostname = hostMap.get(addr.toString());
			if (hostname == null) {
				hostname = addr.getHostName();
				if (hostname != null) {
					hostMap.put(addr.toString(), hostname);
				}
			}
			return hostname;
		} catch (Exception uhex) {
			return addr.toString();
		}

	}

	public static void main(String args[]) throws IOException {
		DnsService ds = new DnsService();
		System.out.println(ds.lookupHostname("10.20.9.137"));
		System.out.println(ds.lookupHostname("10.20.9.137"));
		System.out.println(ds.lookupHostname("10.20.9.137"));
		System.out.println(ds.lookupHostname("10.20.9.137"));
	}

}
