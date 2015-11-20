package com.pluribus.rocketflow.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NvosVport {

	@JsonProperty("mac")
	private String mac;

	@JsonProperty("vlan")
	private long vlan;
	@JsonProperty("vxlan")
	private long vxlan;
	@JsonProperty("ip")
	private String ip;

	@JsonProperty("hostname")
	private String hostname;

	@JsonProperty("hypervisor")
	private String hypervisor;
	
	@JsonProperty("config")
	private String config;
	
	@JsonProperty("tunnel")
	private String tunnel;
	
	@JsonProperty("vm-id")
	private String vmId;
	
	@JsonProperty("vm-name")
	private String vmName;
	
	@JsonProperty("local-intf")
	private long localIntf;
	
	@JsonProperty("switch-id")
	private long switchId;
	
	@JsonProperty("peer-intf")
	private long peerIntf;
	
	@JsonProperty("num-ips")
	private long numIps;
	
	@JsonProperty("config-intf")
	private long configIntf;
	
	@JsonProperty("intf")
	private long intf;
	
	@JsonProperty("vm-flavor")
	private String vmFlavor;
	
	@JsonProperty("vm-status")
	private String vmStatus;
	
	@JsonProperty("memory")
	private long memory;
	
	@JsonProperty("cpus")
	private long cpus;
	
	@JsonProperty("disk")
	private long disk;
	
	@JsonProperty("os")
	private String os;
	
	@JsonProperty("blocked-port")
	private String blockedPort;
	
	@JsonProperty("rem-switch")
	private long remSwitch;
	
	@JsonProperty("ports")
	private String ports;
	
	@JsonProperty("state")
	private String state;
	
	@JsonProperty("local-ports")
	private String localPorts;
	
	@JsonProperty("local-state")
	private String localState;
	
	@JsonProperty("rem-intf")
	private long remIntf;
	
	@JsonProperty("rem-ports")
	private String remPorts;
	
	@JsonProperty("peer-state")
	private String peerState;
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("create-time")
	private String createTime;
	
	@JsonProperty("last-seen")
	private String lastSeen;
	
	@JsonProperty("vxlan-lru")
	private String vxlanLru;
	
	@JsonProperty("hit")
	private long hit;
	
	@JsonProperty("migrate")
	private long migrate;
	
	@JsonProperty("drops")
	private long drops;

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public long getVlan() {
		return vlan;
	}

	public void setVlan(long vlan) {
		this.vlan = vlan;
	}

	public long getVxlan() {
		return vxlan;
	}

	public void setVxlan(long vxlan) {
		this.vxlan = vxlan;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
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

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getTunnel() {
		return tunnel;
	}

	public void setTunnel(String tunnel) {
		this.tunnel = tunnel;
	}

	public String getVmId() {
		return vmId;
	}

	public void setVmId(String vmId) {
		this.vmId = vmId;
	}

	public String getVmName() {
		return vmName;
	}

	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	public long getLocalIntf() {
		return localIntf;
	}

	public void setLocalIntf(long localIntf) {
		this.localIntf = localIntf;
	}

	public long getSwitchId() {
		return switchId;
	}

	public void setSwitchId(long switchId) {
		this.switchId = switchId;
	}

	public long getPeerIntf() {
		return peerIntf;
	}

	public void setPeerIntf(long peerIntf) {
		this.peerIntf = peerIntf;
	}

	public long getNumIps() {
		return numIps;
	}

	public void setNumIps(long numIps) {
		this.numIps = numIps;
	}

	public long getConfigIntf() {
		return configIntf;
	}

	public void setConfigIntf(long configIntf) {
		this.configIntf = configIntf;
	}

	public long getIntf() {
		return intf;
	}

	public void setIntf(long intf) {
		this.intf = intf;
	}

	public String getVmFlavor() {
		return vmFlavor;
	}

	public void setVmFlavor(String vmFlavor) {
		this.vmFlavor = vmFlavor;
	}

	public String getVmStatus() {
		return vmStatus;
	}

	public void setVmStatus(String vmStatus) {
		this.vmStatus = vmStatus;
	}

	public long getMemory() {
		return memory;
	}

	public void setMemory(long memory) {
		this.memory = memory;
	}

	public long getCpus() {
		return cpus;
	}

	public void setCpus(long cpus) {
		this.cpus = cpus;
	}

	public long getDisk() {
		return disk;
	}

	public void setDisk(long disk) {
		this.disk = disk;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getBlockedPort() {
		return blockedPort;
	}

	public void setBlockedPort(String blockedPort) {
		this.blockedPort = blockedPort;
	}

	public long getRemSwitch() {
		return remSwitch;
	}

	public void setRemSwitch(long remSwitch) {
		this.remSwitch = remSwitch;
	}

	public String getPorts() {
		return ports;
	}

	public void setPorts(String ports) {
		this.ports = ports;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLocalPorts() {
		return localPorts;
	}

	public void setLocalPorts(String localPorts) {
		this.localPorts = localPorts;
	}

	public String getLocalState() {
		return localState;
	}

	public void setLocalState(String localState) {
		this.localState = localState;
	}

	public long getRemIntf() {
		return remIntf;
	}

	public void setRemIntf(long remIntf) {
		this.remIntf = remIntf;
	}

	public String getRemPorts() {
		return remPorts;
	}

	public void setRemPorts(String remPorts) {
		this.remPorts = remPorts;
	}

	public String getPeerState() {
		return peerState;
	}

	public void setPeerState(String peerState) {
		this.peerState = peerState;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}

	public String getVxlanLru() {
		return vxlanLru;
	}

	public void setVxlanLru(String vxlanLru) {
		this.vxlanLru = vxlanLru;
	}

	public long getHit() {
		return hit;
	}

	public void setHit(long hit) {
		this.hit = hit;
	}

	public long getMigrate() {
		return migrate;
	}

	public void setMigrate(long migrate) {
		this.migrate = migrate;
	}

	public long getDrops() {
		return drops;
	}

	public void setDrops(long drops) {
		this.drops = drops;
	}

	@Override
	public String toString() {
		return "NvosVport [mac=" + mac + ", vlan=" + vlan + ", vxlan=" + vxlan + ", ip=" + ip + ", hostname=" + hostname
				+ ", hypervisor=" + hypervisor + ", config=" + config + ", tunnel=" + tunnel + ", vmId=" + vmId
				+ ", vmName=" + vmName + ", localIntf=" + localIntf + ", switchId=" + switchId + ", peerIntf="
				+ peerIntf + ", numIps=" + numIps + ", configIntf=" + configIntf + ", intf=" + intf + ", vmFlavor="
				+ vmFlavor + ", vmStatus=" + vmStatus + ", memory=" + memory + ", cpus=" + cpus + ", disk=" + disk
				+ ", os=" + os + ", blockedPort=" + blockedPort + ", remSwitch=" + remSwitch + ", ports=" + ports
				+ ", state=" + state + ", localPorts=" + localPorts + ", localState=" + localState + ", remIntf="
				+ remIntf + ", remPorts=" + remPorts + ", peerState=" + peerState + ", status=" + status
				+ ", createTime=" + createTime + ", lastSeen=" + lastSeen + ", vxlanLru=" + vxlanLru + ", hit=" + hit
				+ ", migrate=" + migrate + ", drops=" + drops + "]";
	}
	
	
}
