package com.pluribus.data.entity;

public interface ConnectionEntity {

	String getId();

//	void setId(String id);
//
	long getAge();

	void setAge(long age);

	String getCurState();

	void setCurState(String curState);

	int getDscp();

	void setDscp(int dscp);

	String getDstIp();

	void setDstIp(String dstIp);

	String getDstMac();

	void setDstMac(String dstMac);

	long getDstPort();

	void setDstPort(long dstPort);

	long getDstSwitchPort();

	void setDstSwitchPort(long dstSwitchPort);

	long getDur();

	void setDur(long dur);

	long getEndedTime();

	void setEndedTime(long endedTime);

	int getEtherType();

	void setEtherType(int etherType);

	String getFabricName();

	void setFabricName(String fabricName);

	long getIbytes();

	void setIbytes(long ibytes);

	long getLatency();

	void setLatency(long latency);

	long getObytes();

	void setObytes(long obytes);

	short getProto();

	void setProto(short proto);

	String getSrcIp();

	void setSrcIp(String srcIp);

	String getSrcMac();

	void setSrcMac(String srcMac);

	long getSrcPort();

	void setSrcPort(long srcPort);

	long getSrcSwitchPort();

	void setSrcSwitchPort(long srcSwitchPort);

	long getStartedTime();

	void setStartedTime(long startedTime);

	String getSwitchName();

	void setSwitchName(String switchName);

	long getTotalBytes();

	void setTotalBytes(long totalBytes);

	long getVlan();

	void setVlan(long vlan);

	String getVnet();

	void setVnet(String vnet);

	long getVxlan();

	void setVxlan(long vxlan);

	String getFlowLocator();

	void setFlowLocator(String flowLocator);

	String getSrcHostname();

	void setSrcHostname(String srcHostname);

	String getDstHostname();

	void setDstHostname(String dstHostname);

}