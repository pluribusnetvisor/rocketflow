package com.pluribus.netviser.dto;

import java.math.BigInteger;
import java.util.Date;

public class VportView {
	private String id;

	private String blockedPort;

	private String config;

	private BigInteger configPort;

	private Date createTime;

	private BigInteger drop;

	private String hostname;

	private String hypervisor;

	private String ip;

	private String ipStr;

	private Date lastSeen;

	private BigInteger localPort;

	private String mac;

	private BigInteger move;

	private BigInteger ownerPort;

	private BigInteger peerPort;

	private BigInteger rate;

	private BigInteger remId;

	private BigInteger remPort;

	private BigInteger switchId;

	private int vlan;

	private BigInteger vmCpu;

	private BigInteger vmDisk;

	private String vmFlavor;

	private String vmId;

	private BigInteger vmMemory;

	private String vmName;

	private String vmOs;

	private BigInteger vxlan;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBlockedPort() {
		return blockedPort;
	}

	public void setBlockedPort(String blockedPort) {
		this.blockedPort = blockedPort;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public BigInteger getConfigPort() {
		return configPort;
	}

	public void setConfigPort(BigInteger configPort) {
		this.configPort = configPort;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigInteger getDrop() {
		return drop;
	}

	public void setDrop(BigInteger drop) {
		this.drop = drop;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getHypervisor() {
		return hypervisor;
	}

	public void setHypervisor(String hypervisor) {
		this.hypervisor = hypervisor;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIpStr() {
		return ipStr;
	}

	public void setIpStr(String ipStr) {
		this.ipStr = ipStr;
	}

	public Date getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}

	public BigInteger getLocalPort() {
		return localPort;
	}

	public void setLocalPort(BigInteger localPort) {
		this.localPort = localPort;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public BigInteger getMove() {
		return move;
	}

	public void setMove(BigInteger move) {
		this.move = move;
	}

	public BigInteger getOwnerPort() {
		return ownerPort;
	}

	public void setOwnerPort(BigInteger ownerPort) {
		this.ownerPort = ownerPort;
	}

	public BigInteger getPeerPort() {
		return peerPort;
	}

	public void setPeerPort(BigInteger peerPort) {
		this.peerPort = peerPort;
	}

	public BigInteger getRate() {
		return rate;
	}

	public void setRate(BigInteger rate) {
		this.rate = rate;
	}

	public BigInteger getRemId() {
		return remId;
	}

	public void setRemId(BigInteger remId) {
		this.remId = remId;
	}

	public BigInteger getRemPort() {
		return remPort;
	}

	public void setRemPort(BigInteger remPort) {
		this.remPort = remPort;
	}

	public BigInteger getSwitchId() {
		return switchId;
	}

	public void setSwitchId(BigInteger switchId) {
		this.switchId = switchId;
	}

	public int getVlan() {
		return vlan;
	}

	public void setVlan(int vlan) {
		this.vlan = vlan;
	}

	public BigInteger getVmCpu() {
		return vmCpu;
	}

	public void setVmCpu(BigInteger vmCpu) {
		this.vmCpu = vmCpu;
	}

	public BigInteger getVmDisk() {
		return vmDisk;
	}

	public void setVmDisk(BigInteger vmDisk) {
		this.vmDisk = vmDisk;
	}

	public String getVmFlavor() {
		return vmFlavor;
	}

	public void setVmFlavor(String vmFlavor) {
		this.vmFlavor = vmFlavor;
	}

	public String getVmId() {
		return vmId;
	}

	public void setVmId(String vmId) {
		this.vmId = vmId;
	}

	public BigInteger getVmMemory() {
		return vmMemory;
	}

	public void setVmMemory(BigInteger vmMemory) {
		this.vmMemory = vmMemory;
	}

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	public String getVmOs() {
		return vmOs;
	}

	public void setVmOs(String vmOs) {
		this.vmOs = vmOs;
	}

	public BigInteger getVxlan() {
		return vxlan;
	}

	public void setVxlan(BigInteger vxlan) {
		this.vxlan = vxlan;
	}
}
