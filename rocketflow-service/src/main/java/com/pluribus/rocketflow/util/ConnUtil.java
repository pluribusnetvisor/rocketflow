package com.pluribus.rocketflow.util;

import com.pluribus.rocketflow.rest.NvosConnection;
import com.pluribusnetworks.config.Conn;

public class ConnUtil {
	public static String generateFlowLocator(String switchName, Conn conn) {
		StringBuilder sb = new StringBuilder();
		sb.append(switchName).append("_")
		.append(conn.getProto()).append("_")
		.append(nonNull(conn.getClientIpStr())).append("_")
		.append(conn.getClientPort()).append("_")
		.append(nonNull(conn.getServerIpStr())).append("_")
		.append(conn.getServerPort());

		sb.toString().replace(':', '_');
		return sb.toString();
	}

	public static String generateFlowLocator(String switchName, NvosConnection conn) {
		StringBuilder sb = new StringBuilder();
		sb.append(switchName).append("_")
		.append(conn.getProto()).append("_")
		.append(nonNull(conn.getSrcIp())).append("_")
		.append(conn.getSrcPort()).append("_")
		.append(nonNull(conn.getDstIp())).append("_")
		.append(conn.getDstPort());

		sb.toString().replace(':', '_');
		return sb.toString();
	}

	private static String nonNull(String s) {
		return (s == null) ? "" : s;
	}
}
