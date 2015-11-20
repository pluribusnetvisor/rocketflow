package com.pluribus.rocketflow.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NvosFabricNode {
	@JsonProperty("serial")
	private String serial;

	@JsonProperty("name")
	private String name;

	@JsonProperty("state")
	private String state;

	@JsonProperty("fab_id")
	private String fabId;

	@JsonProperty("fab_name")
	private String fabName;

	@JsonProperty("id")
	private int id;

	@JsonProperty("cluster_id")
	private String clusterId;

	@JsonProperty("local_mac")
	private String localMac;

	@JsonProperty("fabric_network")
	private String fabricNetwork;

	@JsonProperty("mgmt_ip")
	private String mgmtIp;

	@JsonProperty("mgmt_netmask")
	private int mgmtNetmask;

	@JsonProperty("mgmt_secondary_macs")
	private String mgmtSecondaryMacs;

	@JsonProperty("in_band_ip")
	private String inBandIp;

	@JsonProperty("in_band_netmask")
	private int inBandNetmask;

	@JsonProperty("in_band_vlan")
	private int inBandVlan;

	@JsonProperty("in_band_secondary_macs")
	private String inBandSecondaryMacs;

	@JsonProperty("fab_tid")
	private int fabTid;

	@JsonProperty("cluster_tid")
	private int clusterTid;

	@JsonProperty("out_port")
	private int outPort;

	@JsonProperty("ports")
	private int ports;

	@JsonProperty("firmware_upgrade")
	private String firmwareUpgrade;

	@JsonProperty("version")
	private String version;

	@JsonProperty("device_state")
	private String deviceState;

	@JsonProperty("mgmt_mac")
	private String mgmtMac;

	@JsonProperty("in_band_mac")
	private String inBandMac;

	@JsonProperty("span_nic")
	private String spanNic;

	@JsonProperty("span_ip")
	private String spanIp;

	@JsonProperty("span_netmask")
	private int spanNetmask;

	@JsonProperty("span_assignment")
	private String spanAssignment;

	@JsonProperty("span_mac")
	private String spanMac;

	@JsonProperty("span_vlan")
	private int spanVlan;

	@JsonProperty("span_vxlan")
	private int spanVxlan;

	@JsonProperty("span_if")
	private String spanIf;

	@JsonProperty("span_alias_on")
	private String spanAliasOn;

	@JsonProperty("span_vm_nic_type")
	private String spanVmNicType;

	@JsonProperty("span_exclusive")
	private boolean spanExclusive;

	@JsonProperty("span_nic_config")
	private boolean spanNicConfig;

	@JsonProperty("span_nic_state")
	private String spanNicState;

	@JsonProperty("span_vrrp_id")
	private int spanVrrpId;

	@JsonProperty("span_vrrp_primary")
	private String spanVrrpPrimary;

	@JsonProperty("span_vrrp_priority")
	private short spanVrrpPriority;

	@JsonProperty("span_vrrp_adv_int")
	private String spanVrrpAdvInt;

	@JsonProperty("span_vrrp_state")
	private String spanVrrpState;

	@JsonProperty("span_l3_port")
	private int spanL3Port;

	@JsonProperty("span_secondary_macs")
	private String spanSecondaryMacs;

	@JsonProperty("cluster_nic")
	private String clusterNic;

	@JsonProperty("cluster_ip")
	private String clusterIp;

	@JsonProperty("cluster_netmask")
	private int clusterNetmask;

	@JsonProperty("cluster_assignment")
	private String clusterAssignment;

	@JsonProperty("cluster_mac")
	private String clusterMac;

	@JsonProperty("cluster_vlan")
	private int clusterVlan;

	@JsonProperty("cluster_vxlan")
	private int clusterVxlan;

	@JsonProperty("cluster_if")
	private String clusterIf;

	@JsonProperty("cluster_alias_on")
	private String clusterAliasOn;

	@JsonProperty("cluster_vm_nic_type")
	private String clusterVmNicType;

	@JsonProperty("cluster_exclusive")
	private boolean clusterExclusive;

	@JsonProperty("cluster_nic_config")
	private boolean clusterNicConfig;

	@JsonProperty("cluster_nic_state")
	private String clusterNicState;

	@JsonProperty("cluster_vrrp_id")
	private int clusterVrrpId;

	@JsonProperty("cluster_vrrp_primary")
	private String clusterVrrpPrimary;

	@JsonProperty("cluster_vrrp_priority")
	private short clusterVrrpPriority;

	@JsonProperty("cluster_vrrp_adv_int")
	private int clusterVrrpAdvInt;

	@JsonProperty("cluster_vrrp_state")
	private String clusterVrrpState;

	@JsonProperty("cluster_l3_port")
	private int clusterL3Port;

	@JsonProperty("cluster_secondary_macs")
	private String clusterSecondaryMacs;

	@JsonProperty("mgmtv6_nic")
	private String mgmtv6Nic;

	@JsonProperty("mgmtv6_ip")
	private String mgmtv6Ip;

	@JsonProperty("mgmtv6_netmask")
	private int mgmtv6Netmask;

	@JsonProperty("mgmtv6_assignment")
	private String mgmtv6Assignment;

	@JsonProperty("mgmtv6_mac")
	private String mgmtv6Mac;

	@JsonProperty("mgmtv6_vlan")
	private int mgmtv6Vlan;

	@JsonProperty("mgmtv6_vxlan")
	private int mgmtv6Vxlan;

	@JsonProperty("mgmtv6_if")
	private String mgmtv6If;

	@JsonProperty("mgmtv6_alias_on")
	private String mgmtv6AliasOn;

	@JsonProperty("mgmtv6_vm_nic_type")
	private String mgmtv6VmNicType;

	@JsonProperty("mgmtv6_exclusive")
	private boolean mgmtv6Exclusive;

	@JsonProperty("mgmtv6_nic_config")
	private boolean mgmtv6NicConfig;

	@JsonProperty("mgmtv6_nic_state")
	private String mgmtv6NicState;

	@JsonProperty("mgmtv6_vrrp_id")
	private int mgmtv6VrrpId;

	@JsonProperty("mgmtv6_vrrp_primary")
	private String mgmtv6VrrpPrimary;

	@JsonProperty("mgmtv6_vrrp_priority")
	private short mgmtv6VrrpPriority;

	@JsonProperty("mgmtv6_vrrp_adv_int")
	private int mgmtv6VrrpAdvInt;

	@JsonProperty("mgmtv6_vrrp_state")
	private String mgmtv6VrrpState;

	@JsonProperty("mgmtv6_l3_port")
	private int mgmtv6L3Port;

	@JsonProperty("mgmtv6_secondary_macs")
	private String mgmtv6SecondaryMacs;

	@JsonProperty("datav6_nic")
	private String datav6Nic;

	@JsonProperty("datav6_ip")
	private String datav6Ip;

	@JsonProperty("datav6_netmask")
	private int datav6Netmask;

	@JsonProperty("datav6_assignment")
	private String datav6Assignment;

	@JsonProperty("datav6_mac")
	private String datav6Mac;

	@JsonProperty("datav6_vlan")
	private int datav6Vlan;

	@JsonProperty("datav6_vxlan")
	private int datav6Vxlan;

	@JsonProperty("datav6_if")
	private String datav6If;

	@JsonProperty("datav6_alias_on")
	private String datav6AliasOn;

	@JsonProperty("datav6_vm_nic_type")
	private String datav6VmNicType;

	@JsonProperty("datav6_exclusive")
	private boolean datav6Exclusive;

	@JsonProperty("datav6_nic_config")
	private boolean datav6NicConfig;

	@JsonProperty("datav6_nic_state")
	private String datav6NicState;

	@JsonProperty("datav6_vrrp_id")
	private int datav6VrrpId;

	@JsonProperty("datav6_vrrp_primary")
	private String datav6VrrpPrimary;

	@JsonProperty("datav6_vrrp_priority")
	private short datav6VrrpPriority;

	@JsonProperty("datav6_vrrp_adv_int")
	private int datav6VrrpAdvInt;

	@JsonProperty("datav6_vrrp_state")
	private String datav6VrrpState;

	@JsonProperty("datav6_l3_port")
	private int datav6L3Port;

	@JsonProperty("datav6_secondary_macs")
	private String datav6SecondaryMacs;

	@JsonProperty("maj")
	private short maj;

	@JsonProperty("min")
	private short min;

	@JsonProperty("build")
	private int build;

	@JsonProperty("os")
	private String os;

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFabId() {
		return fabId;
	}

	public void setFabId(String fabId) {
		this.fabId = fabId;
	}

	public String getFabName() {
		return fabName;
	}

	public void setFabName(String fabName) {
		this.fabName = fabName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getLocalMac() {
		return localMac;
	}

	public void setLocalMac(String localMac) {
		this.localMac = localMac;
	}

	public String getFabricNetwork() {
		return fabricNetwork;
	}

	public void setFabricNetwork(String fabricNetwork) {
		this.fabricNetwork = fabricNetwork;
	}

	public String getMgmtIp() {
		return mgmtIp;
	}

	public void setMgmtIp(String mgmtIp) {
		this.mgmtIp = mgmtIp;
	}

	public int getMgmtNetmask() {
		return mgmtNetmask;
	}

	public void setMgmtNetmask(int mgmtNetmask) {
		this.mgmtNetmask = mgmtNetmask;
	}

	public String getMgmtSecondaryMacs() {
		return mgmtSecondaryMacs;
	}

	public void setMgmtSecondaryMacs(String mgmtSecondaryMacs) {
		this.mgmtSecondaryMacs = mgmtSecondaryMacs;
	}

	public String getInBandIp() {
		return inBandIp;
	}

	public void setInBandIp(String inBandIp) {
		this.inBandIp = inBandIp;
	}

	public int getInBandNetmask() {
		return inBandNetmask;
	}

	public void setInBandNetmask(int inBandNetmask) {
		this.inBandNetmask = inBandNetmask;
	}

	public int getInBandVlan() {
		return inBandVlan;
	}

	public void setInBandVlan(int inBandVlan) {
		this.inBandVlan = inBandVlan;
	}

	public String getInBandSecondaryMacs() {
		return inBandSecondaryMacs;
	}

	public void setInBandSecondaryMacs(String inBandSecondaryMacs) {
		this.inBandSecondaryMacs = inBandSecondaryMacs;
	}

	public int getFabTid() {
		return fabTid;
	}

	public void setFabTid(int fabTid) {
		this.fabTid = fabTid;
	}

	public int getClusterTid() {
		return clusterTid;
	}

	public void setClusterTid(int clusterTid) {
		this.clusterTid = clusterTid;
	}

	public int getOutPort() {
		return outPort;
	}

	public void setOutPort(int outPort) {
		this.outPort = outPort;
	}

	public int getPorts() {
		return ports;
	}

	public void setPorts(int ports) {
		this.ports = ports;
	}

	public String getFirmwareUpgrade() {
		return firmwareUpgrade;
	}

	public void setFirmwareUpgrade(String firmwareUpgrade) {
		this.firmwareUpgrade = firmwareUpgrade;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDeviceState() {
		return deviceState;
	}

	public void setDeviceState(String deviceState) {
		this.deviceState = deviceState;
	}

	public String getMgmtMac() {
		return mgmtMac;
	}

	public void setMgmtMac(String mgmtMac) {
		this.mgmtMac = mgmtMac;
	}

	public String getInBandMac() {
		return inBandMac;
	}

	public void setInBandMac(String inBandMac) {
		this.inBandMac = inBandMac;
	}

	public String getSpanNic() {
		return spanNic;
	}

	public void setSpanNic(String spanNic) {
		this.spanNic = spanNic;
	}

	public String getSpanIp() {
		return spanIp;
	}

	public void setSpanIp(String spanIp) {
		this.spanIp = spanIp;
	}

	public int getSpanNetmask() {
		return spanNetmask;
	}

	public void setSpanNetmask(int spanNetmask) {
		this.spanNetmask = spanNetmask;
	}

	public String getSpanAssignment() {
		return spanAssignment;
	}

	public void setSpanAssignment(String spanAssignment) {
		this.spanAssignment = spanAssignment;
	}

	public String getSpanMac() {
		return spanMac;
	}

	public void setSpanMac(String spanMac) {
		this.spanMac = spanMac;
	}

	public int getSpanVlan() {
		return spanVlan;
	}

	public void setSpanVlan(int spanVlan) {
		this.spanVlan = spanVlan;
	}

	public int getSpanVxlan() {
		return spanVxlan;
	}

	public void setSpanVxlan(int spanVxlan) {
		this.spanVxlan = spanVxlan;
	}

	public String getSpanIf() {
		return spanIf;
	}

	public void setSpanIf(String spanIf) {
		this.spanIf = spanIf;
	}

	public String getSpanAliasOn() {
		return spanAliasOn;
	}

	public void setSpanAliasOn(String spanAliasOn) {
		this.spanAliasOn = spanAliasOn;
	}

	public String getSpanVmNicType() {
		return spanVmNicType;
	}

	public void setSpanVmNicType(String spanVmNicType) {
		this.spanVmNicType = spanVmNicType;
	}

	public boolean isSpanExclusive() {
		return spanExclusive;
	}

	public void setSpanExclusive(boolean spanExclusive) {
		this.spanExclusive = spanExclusive;
	}

	public boolean isSpanNicConfig() {
		return spanNicConfig;
	}

	public void setSpanNicConfig(boolean spanNicConfig) {
		this.spanNicConfig = spanNicConfig;
	}

	public String getSpanNicState() {
		return spanNicState;
	}

	public void setSpanNicState(String spanNicState) {
		this.spanNicState = spanNicState;
	}

	public int getSpanVrrpId() {
		return spanVrrpId;
	}

	public void setSpanVrrpId(int spanVrrpId) {
		this.spanVrrpId = spanVrrpId;
	}

	public String getSpanVrrpPrimary() {
		return spanVrrpPrimary;
	}

	public void setSpanVrrpPrimary(String spanVrrpPrimary) {
		this.spanVrrpPrimary = spanVrrpPrimary;
	}

	public short getSpanVrrpPriority() {
		return spanVrrpPriority;
	}

	public void setSpanVrrpPriority(short spanVrrpPriority) {
		this.spanVrrpPriority = spanVrrpPriority;
	}

	public String getSpanVrrpAdvInt() {
		return spanVrrpAdvInt;
	}

	public void setSpanVrrpAdvInt(String spanVrrpAdvInt) {
		this.spanVrrpAdvInt = spanVrrpAdvInt;
	}

	public String getSpanVrrpState() {
		return spanVrrpState;
	}

	public void setSpanVrrpState(String spanVrrpState) {
		this.spanVrrpState = spanVrrpState;
	}

	public int getSpanL3Port() {
		return spanL3Port;
	}

	public void setSpanL3Port(int spanL3Port) {
		this.spanL3Port = spanL3Port;
	}

	public String getSpanSecondaryMacs() {
		return spanSecondaryMacs;
	}

	public void setSpanSecondaryMacs(String spanSecondaryMacs) {
		this.spanSecondaryMacs = spanSecondaryMacs;
	}

	public String getClusterNic() {
		return clusterNic;
	}

	public void setClusterNic(String clusterNic) {
		this.clusterNic = clusterNic;
	}

	public String getClusterIp() {
		return clusterIp;
	}

	public void setClusterIp(String clusterIp) {
		this.clusterIp = clusterIp;
	}

	public int getClusterNetmask() {
		return clusterNetmask;
	}

	public void setClusterNetmask(int clusterNetmask) {
		this.clusterNetmask = clusterNetmask;
	}

	public String getClusterAssignment() {
		return clusterAssignment;
	}

	public void setClusterAssignment(String clusterAssignment) {
		this.clusterAssignment = clusterAssignment;
	}

	public String getClusterMac() {
		return clusterMac;
	}

	public void setClusterMac(String clusterMac) {
		this.clusterMac = clusterMac;
	}

	public int getClusterVlan() {
		return clusterVlan;
	}

	public void setClusterVlan(int clusterVlan) {
		this.clusterVlan = clusterVlan;
	}

	public int getClusterVxlan() {
		return clusterVxlan;
	}

	public void setClusterVxlan(int clusterVxlan) {
		this.clusterVxlan = clusterVxlan;
	}

	public String getClusterIf() {
		return clusterIf;
	}

	public void setClusterIf(String clusterIf) {
		this.clusterIf = clusterIf;
	}

	public String getClusterAliasOn() {
		return clusterAliasOn;
	}

	public void setClusterAliasOn(String clusterAliasOn) {
		this.clusterAliasOn = clusterAliasOn;
	}

	public String getClusterVmNicType() {
		return clusterVmNicType;
	}

	public void setClusterVmNicType(String clusterVmNicType) {
		this.clusterVmNicType = clusterVmNicType;
	}

	public boolean isClusterExclusive() {
		return clusterExclusive;
	}

	public void setClusterExclusive(boolean clusterExclusive) {
		this.clusterExclusive = clusterExclusive;
	}

	public boolean isClusterNicConfig() {
		return clusterNicConfig;
	}

	public void setClusterNicConfig(boolean clusterNicConfig) {
		this.clusterNicConfig = clusterNicConfig;
	}

	public String getClusterNicState() {
		return clusterNicState;
	}

	public void setClusterNicState(String clusterNicState) {
		this.clusterNicState = clusterNicState;
	}

	public int getClusterVrrpId() {
		return clusterVrrpId;
	}

	public void setClusterVrrpId(int clusterVrrpId) {
		this.clusterVrrpId = clusterVrrpId;
	}

	public String getClusterVrrpPrimary() {
		return clusterVrrpPrimary;
	}

	public void setClusterVrrpPrimary(String clusterVrrpPrimary) {
		this.clusterVrrpPrimary = clusterVrrpPrimary;
	}

	public short getClusterVrrpPriority() {
		return clusterVrrpPriority;
	}

	public void setClusterVrrpPriority(short clusterVrrpPriority) {
		this.clusterVrrpPriority = clusterVrrpPriority;
	}

	public int getClusterVrrpAdvInt() {
		return clusterVrrpAdvInt;
	}

	public void setClusterVrrpAdvInt(int clusterVrrpAdvInt) {
		this.clusterVrrpAdvInt = clusterVrrpAdvInt;
	}

	public String getClusterVrrpState() {
		return clusterVrrpState;
	}

	public void setClusterVrrpState(String clusterVrrpState) {
		this.clusterVrrpState = clusterVrrpState;
	}

	public int getClusterL3Port() {
		return clusterL3Port;
	}

	public void setClusterL3Port(int clusterL3Port) {
		this.clusterL3Port = clusterL3Port;
	}

	public String getClusterSecondaryMacs() {
		return clusterSecondaryMacs;
	}

	public void setClusterSecondaryMacs(String clusterSecondaryMacs) {
		this.clusterSecondaryMacs = clusterSecondaryMacs;
	}

	public String getMgmtv6Nic() {
		return mgmtv6Nic;
	}

	public void setMgmtv6Nic(String mgmtv6Nic) {
		this.mgmtv6Nic = mgmtv6Nic;
	}

	public String getMgmtv6Ip() {
		return mgmtv6Ip;
	}

	public void setMgmtv6Ip(String mgmtv6Ip) {
		this.mgmtv6Ip = mgmtv6Ip;
	}

	public int getMgmtv6Netmask() {
		return mgmtv6Netmask;
	}

	public void setMgmtv6Netmask(int mgmtv6Netmask) {
		this.mgmtv6Netmask = mgmtv6Netmask;
	}

	public String getMgmtv6Assignment() {
		return mgmtv6Assignment;
	}

	public void setMgmtv6Assignment(String mgmtv6Assignment) {
		this.mgmtv6Assignment = mgmtv6Assignment;
	}

	public String getMgmtv6Mac() {
		return mgmtv6Mac;
	}

	public void setMgmtv6Mac(String mgmtv6Mac) {
		this.mgmtv6Mac = mgmtv6Mac;
	}

	public int getMgmtv6Vlan() {
		return mgmtv6Vlan;
	}

	public void setMgmtv6Vlan(int mgmtv6Vlan) {
		this.mgmtv6Vlan = mgmtv6Vlan;
	}

	public int getMgmtv6Vxlan() {
		return mgmtv6Vxlan;
	}

	public void setMgmtv6Vxlan(int mgmtv6Vxlan) {
		this.mgmtv6Vxlan = mgmtv6Vxlan;
	}

	public String getMgmtv6If() {
		return mgmtv6If;
	}

	public void setMgmtv6If(String mgmtv6If) {
		this.mgmtv6If = mgmtv6If;
	}

	public String getMgmtv6AliasOn() {
		return mgmtv6AliasOn;
	}

	public void setMgmtv6AliasOn(String mgmtv6AliasOn) {
		this.mgmtv6AliasOn = mgmtv6AliasOn;
	}

	public String getMgmtv6VmNicType() {
		return mgmtv6VmNicType;
	}

	public void setMgmtv6VmNicType(String mgmtv6VmNicType) {
		this.mgmtv6VmNicType = mgmtv6VmNicType;
	}

	public boolean isMgmtv6Exclusive() {
		return mgmtv6Exclusive;
	}

	public void setMgmtv6Exclusive(boolean mgmtv6Exclusive) {
		this.mgmtv6Exclusive = mgmtv6Exclusive;
	}

	public boolean isMgmtv6NicConfig() {
		return mgmtv6NicConfig;
	}

	public void setMgmtv6NicConfig(boolean mgmtv6NicConfig) {
		this.mgmtv6NicConfig = mgmtv6NicConfig;
	}

	public String getMgmtv6NicState() {
		return mgmtv6NicState;
	}

	public void setMgmtv6NicState(String mgmtv6NicState) {
		this.mgmtv6NicState = mgmtv6NicState;
	}

	public int getMgmtv6VrrpId() {
		return mgmtv6VrrpId;
	}

	public void setMgmtv6VrrpId(int mgmtv6VrrpId) {
		this.mgmtv6VrrpId = mgmtv6VrrpId;
	}

	public String getMgmtv6VrrpPrimary() {
		return mgmtv6VrrpPrimary;
	}

	public void setMgmtv6VrrpPrimary(String mgmtv6VrrpPrimary) {
		this.mgmtv6VrrpPrimary = mgmtv6VrrpPrimary;
	}

	public short getMgmtv6VrrpPriority() {
		return mgmtv6VrrpPriority;
	}

	public void setMgmtv6VrrpPriority(short mgmtv6VrrpPriority) {
		this.mgmtv6VrrpPriority = mgmtv6VrrpPriority;
	}

	public int getMgmtv6VrrpAdvInt() {
		return mgmtv6VrrpAdvInt;
	}

	public void setMgmtv6VrrpAdvInt(int mgmtv6VrrpAdvInt) {
		this.mgmtv6VrrpAdvInt = mgmtv6VrrpAdvInt;
	}

	public String getMgmtv6VrrpState() {
		return mgmtv6VrrpState;
	}

	public void setMgmtv6VrrpState(String mgmtv6VrrpState) {
		this.mgmtv6VrrpState = mgmtv6VrrpState;
	}

	public int getMgmtv6L3Port() {
		return mgmtv6L3Port;
	}

	public void setMgmtv6L3Port(int mgmtv6l3Port) {
		mgmtv6L3Port = mgmtv6l3Port;
	}

	public String getMgmtv6SecondaryMacs() {
		return mgmtv6SecondaryMacs;
	}

	public void setMgmtv6SecondaryMacs(String mgmtv6SecondaryMacs) {
		this.mgmtv6SecondaryMacs = mgmtv6SecondaryMacs;
	}

	public String getDatav6Nic() {
		return datav6Nic;
	}

	public void setDatav6Nic(String datav6Nic) {
		this.datav6Nic = datav6Nic;
	}

	public String getDatav6Ip() {
		return datav6Ip;
	}

	public void setDatav6Ip(String datav6Ip) {
		this.datav6Ip = datav6Ip;
	}

	public int getDatav6Netmask() {
		return datav6Netmask;
	}

	public void setDatav6Netmask(int datav6Netmask) {
		this.datav6Netmask = datav6Netmask;
	}

	public String getDatav6Assignment() {
		return datav6Assignment;
	}

	public void setDatav6Assignment(String datav6Assignment) {
		this.datav6Assignment = datav6Assignment;
	}

	public String getDatav6Mac() {
		return datav6Mac;
	}

	public void setDatav6Mac(String datav6Mac) {
		this.datav6Mac = datav6Mac;
	}

	public int getDatav6Vlan() {
		return datav6Vlan;
	}

	public void setDatav6Vlan(int datav6Vlan) {
		this.datav6Vlan = datav6Vlan;
	}

	public int getDatav6Vxlan() {
		return datav6Vxlan;
	}

	public void setDatav6Vxlan(int datav6Vxlan) {
		this.datav6Vxlan = datav6Vxlan;
	}

	public String getDatav6If() {
		return datav6If;
	}

	public void setDatav6If(String datav6If) {
		this.datav6If = datav6If;
	}

	public String getDatav6AliasOn() {
		return datav6AliasOn;
	}

	public void setDatav6AliasOn(String datav6AliasOn) {
		this.datav6AliasOn = datav6AliasOn;
	}

	public String getDatav6VmNicType() {
		return datav6VmNicType;
	}

	public void setDatav6VmNicType(String datav6VmNicType) {
		this.datav6VmNicType = datav6VmNicType;
	}

	public boolean isDatav6Exclusive() {
		return datav6Exclusive;
	}

	public void setDatav6Exclusive(boolean datav6Exclusive) {
		this.datav6Exclusive = datav6Exclusive;
	}

	public boolean isDatav6NicConfig() {
		return datav6NicConfig;
	}

	public void setDatav6NicConfig(boolean datav6NicConfig) {
		this.datav6NicConfig = datav6NicConfig;
	}

	public String getDatav6NicState() {
		return datav6NicState;
	}

	public void setDatav6NicState(String datav6NicState) {
		this.datav6NicState = datav6NicState;
	}

	public int getDatav6VrrpId() {
		return datav6VrrpId;
	}

	public void setDatav6VrrpId(int datav6VrrpId) {
		this.datav6VrrpId = datav6VrrpId;
	}

	public String getDatav6VrrpPrimary() {
		return datav6VrrpPrimary;
	}

	public void setDatav6VrrpPrimary(String datav6VrrpPrimary) {
		this.datav6VrrpPrimary = datav6VrrpPrimary;
	}

	public short getDatav6VrrpPriority() {
		return datav6VrrpPriority;
	}

	public void setDatav6VrrpPriority(short datav6VrrpPriority) {
		this.datav6VrrpPriority = datav6VrrpPriority;
	}

	public int getDatav6VrrpAdvInt() {
		return datav6VrrpAdvInt;
	}

	public void setDatav6VrrpAdvInt(int datav6VrrpAdvInt) {
		this.datav6VrrpAdvInt = datav6VrrpAdvInt;
	}

	public String getDatav6VrrpState() {
		return datav6VrrpState;
	}

	public void setDatav6VrrpState(String datav6VrrpState) {
		this.datav6VrrpState = datav6VrrpState;
	}

	public int getDatav6L3Port() {
		return datav6L3Port;
	}

	public void setDatav6L3Port(int datav6l3Port) {
		datav6L3Port = datav6l3Port;
	}

	public String getDatav6SecondaryMacs() {
		return datav6SecondaryMacs;
	}

	public void setDatav6SecondaryMacs(String datav6SecondaryMacs) {
		this.datav6SecondaryMacs = datav6SecondaryMacs;
	}

	public short getMaj() {
		return maj;
	}

	public void setMaj(short maj) {
		this.maj = maj;
	}

	public short getMin() {
		return min;
	}

	public void setMin(short min) {
		this.min = min;
	}

	public int getBuild() {
		return build;
	}

	public void setBuild(int build) {
		this.build = build;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "NvosFabricNode [serial=" + serial + ", name=" + name + ", state=" + state + ", fabId=" + fabId
				+ ", fabName=" + fabName + ", id=" + id + ", clusterId=" + clusterId + ", localMac=" + localMac
				+ ", fabricNetwork=" + fabricNetwork + ", mgmtIp=" + mgmtIp + ", mgmtNetmask=" + mgmtNetmask
				+ ", mgmtSecondaryMacs=" + mgmtSecondaryMacs + ", inBandIp=" + inBandIp + ", inBandNetmask="
				+ inBandNetmask + ", inBandVlan=" + inBandVlan + ", inBandSecondaryMacs=" + inBandSecondaryMacs
				+ ", fabTid=" + fabTid + ", clusterTid=" + clusterTid + ", outPort=" + outPort + ", ports=" + ports
				+ ", firmwareUpgrade=" + firmwareUpgrade + ", version=" + version + ", deviceState=" + deviceState
				+ ", mgmtMac=" + mgmtMac + ", inBandMac=" + inBandMac + ", spanNic=" + spanNic + ", spanIp=" + spanIp
				+ ", spanNetmask=" + spanNetmask + ", spanAssignment=" + spanAssignment + ", spanMac=" + spanMac
				+ ", spanVlan=" + spanVlan + ", spanVxlan=" + spanVxlan + ", spanIf=" + spanIf + ", spanAliasOn="
				+ spanAliasOn + ", spanVmNicType=" + spanVmNicType + ", spanExclusive=" + spanExclusive
				+ ", spanNicConfig=" + spanNicConfig + ", spanNicState=" + spanNicState + ", spanVrrpId=" + spanVrrpId
				+ ", spanVrrpPrimary=" + spanVrrpPrimary + ", spanVrrpPriority=" + spanVrrpPriority
				+ ", spanVrrpAdvInt=" + spanVrrpAdvInt + ", spanVrrpState=" + spanVrrpState + ", spanL3Port="
				+ spanL3Port + ", spanSecondaryMacs=" + spanSecondaryMacs + ", clusterNic=" + clusterNic
				+ ", clusterIp=" + clusterIp + ", clusterNetmask=" + clusterNetmask + ", clusterAssignment="
				+ clusterAssignment + ", clusterMac=" + clusterMac + ", clusterVlan=" + clusterVlan + ", clusterVxlan="
				+ clusterVxlan + ", clusterIf=" + clusterIf + ", clusterAliasOn=" + clusterAliasOn
				+ ", clusterVmNicType=" + clusterVmNicType + ", clusterExclusive=" + clusterExclusive
				+ ", clusterNicConfig=" + clusterNicConfig + ", clusterNicState=" + clusterNicState + ", clusterVrrpId="
				+ clusterVrrpId + ", clusterVrrpPrimary=" + clusterVrrpPrimary + ", clusterVrrpPriority="
				+ clusterVrrpPriority + ", clusterVrrpAdvInt=" + clusterVrrpAdvInt + ", clusterVrrpState="
				+ clusterVrrpState + ", clusterL3Port=" + clusterL3Port + ", clusterSecondaryMacs="
				+ clusterSecondaryMacs + ", mgmtv6Nic=" + mgmtv6Nic + ", mgmtv6Ip=" + mgmtv6Ip + ", mgmtv6Netmask="
				+ mgmtv6Netmask + ", mgmtv6Assignment=" + mgmtv6Assignment + ", mgmtv6Mac=" + mgmtv6Mac
				+ ", mgmtv6Vlan=" + mgmtv6Vlan + ", mgmtv6Vxlan=" + mgmtv6Vxlan + ", mgmtv6If=" + mgmtv6If
				+ ", mgmtv6AliasOn=" + mgmtv6AliasOn + ", mgmtv6VmNicType=" + mgmtv6VmNicType + ", mgmtv6Exclusive="
				+ mgmtv6Exclusive + ", mgmtv6NicConfig=" + mgmtv6NicConfig + ", mgmtv6NicState=" + mgmtv6NicState
				+ ", mgmtv6VrrpId=" + mgmtv6VrrpId + ", mgmtv6VrrpPrimary=" + mgmtv6VrrpPrimary
				+ ", mgmtv6VrrpPriority=" + mgmtv6VrrpPriority + ", mgmtv6VrrpAdvInt=" + mgmtv6VrrpAdvInt
				+ ", mgmtv6VrrpState=" + mgmtv6VrrpState + ", mgmtv6L3Port=" + mgmtv6L3Port + ", mgmtv6SecondaryMacs="
				+ mgmtv6SecondaryMacs + ", datav6Nic=" + datav6Nic + ", datav6Ip=" + datav6Ip + ", datav6Netmask="
				+ datav6Netmask + ", datav6Assignment=" + datav6Assignment + ", datav6Mac=" + datav6Mac
				+ ", datav6Vlan=" + datav6Vlan + ", datav6Vxlan=" + datav6Vxlan + ", datav6If=" + datav6If
				+ ", datav6AliasOn=" + datav6AliasOn + ", datav6VmNicType=" + datav6VmNicType + ", datav6Exclusive="
				+ datav6Exclusive + ", datav6NicConfig=" + datav6NicConfig + ", datav6NicState=" + datav6NicState
				+ ", datav6VrrpId=" + datav6VrrpId + ", datav6VrrpPrimary=" + datav6VrrpPrimary
				+ ", datav6VrrpPriority=" + datav6VrrpPriority + ", datav6VrrpAdvInt=" + datav6VrrpAdvInt
				+ ", datav6VrrpState=" + datav6VrrpState + ", datav6L3Port=" + datav6L3Port + ", datav6SecondaryMacs="
				+ datav6SecondaryMacs + ", maj=" + maj + ", min=" + min + ", build=" + build + ", os=" + os + "]";
	}


}
