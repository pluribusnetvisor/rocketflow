package com.pluribus.data.entity;

import java.util.Date;

public interface VportEntity {

	String getId();

//	void setId(String id);

	String getBlockedPort();

	void setBlockedPort(String blockedPort);

	String getConfig();

	void setConfig(String config);

	long getConfigPort();

	void setConfigPort(long configPort);

	Date getCreateTime();

	void setCreateTime(Date createTime);

	long getDrop();

	void setDrop(long drop);

	String getHostname();

	void setHostname(String hostname);

	String getHypervisor();

	void setHypervisor(String hypervisor);

	String getIp();

	void setIp(String ip);

	Date getLastSeen();

	void setLastSeen(Date lastSeen);

	long getLocalPort();

	void setLocalPort(long localPort);

	String getMac();

	void setMac(String mac);

	long getMove();

	void setMove(long move);

	long getOwnerPort();

	void setOwnerPort(long ownerPort);

	long getPeerPort();

	void setPeerPort(long peerPort);

	long getRate();

	void setRate(long rate);

	long getRemId();

	void setRemId(long remId);

	long getRemPort();

	void setRemPort(long remPort);

	long getSwitchId();

	void setSwitchId(long switchId);

	int getVlan();

	void setVlan(int vlan);

	long getVmCpu();

	void setVmCpu(long vmCpu);

	long getVmDisk();

	void setVmDisk(long vmDisk);

	String getVmFlavor();

	void setVmFlavor(String vmFlavor);

	String getVmId();

	void setVmId(String vmId);

	long getVmMemory();

	void setVmMemory(long vmMemory);

	String getVmName();

	void setVmName(String vmName);

	String getVmOs();

	void setVmOs(String vmOs);

	long getVxlan();

	void setVxlan(long vxlan);

	String getPortFlags();

	void setPortFlags(String portFlags);

	String getOwnerL2Flags();

	void setOwnerL2Flags(String ownerL2Flags);

	String getPeerL2Flags();

	void setPeerL2Flags(String peerL2Flags);

}