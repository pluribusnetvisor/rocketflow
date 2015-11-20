package com.pluribus.netviser.dto;

import java.math.BigInteger;
import java.sql.Timestamp;

public class ConnectionView {
	private String id;

	private String age;

	private String curState;

	private int dscp;
	private String dstIp;

	private String dstMac;

	private String dstPort;

	private int dstSwitchPort;

	private BigInteger dur;

	private Timestamp endedTime;

	private String etherType;

	private BigInteger ibytes;

	private BigInteger latency;

	private BigInteger obytes;

	private String proto;

	private String srcIp;

	private String srcMac;

	private String src_port;

	private int srcSwitchPort;

	private Timestamp startedTime;

	private String switchId;

	private BigInteger totalBytes;

	private int vlan;

	private String vnet;

	private int vxlan;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCurState() {
		return curState;
	}

	public void setCurState(String curState) {
		this.curState = curState;
	}

	public int getDscp() {
		return dscp;
	}

	public void setDscp(int dscp) {
		this.dscp = dscp;
	}

	public String getDstIp() {
		return dstIp;
	}

	public void setDstIp(String dstIp) {
		this.dstIp = dstIp;
	}

	public String getDstMac() {
		return dstMac;
	}

	public void setDstMac(String dstMac) {
		this.dstMac = dstMac;
	}

	public String getDstPort() {
		return dstPort;
	}

	public void setDstPort(String dstPort) {
		this.dstPort = dstPort;
	}

	public int getDstSwitchPort() {
		return dstSwitchPort;
	}

	public void setDstSwitchPort(int dstSwitchPort) {
		this.dstSwitchPort = dstSwitchPort;
	}

	public BigInteger getDur() {
		return dur;
	}

	public void setDur(BigInteger dur) {
		this.dur = dur;
	}

	public Timestamp getEndedTime() {
		return endedTime;
	}

	public void setEndedTime(Timestamp endedTime) {
		this.endedTime = endedTime;
	}

	public String getEtherType() {
		return etherType;
	}

	public void setEtherType(String etherType) {
		this.etherType = etherType;
	}

	public BigInteger getIbytes() {
		return ibytes;
	}

	public void setIbytes(BigInteger ibytes) {
		this.ibytes = ibytes;
	}

	public BigInteger getLatency() {
		return latency;
	}

	public void setLatency(BigInteger latency) {
		this.latency = latency;
	}

	public BigInteger getObytes() {
		return obytes;
	}

	public void setObytes(BigInteger obytes) {
		this.obytes = obytes;
	}

	public String getProto() {
		return proto;
	}

	public void setProto(String proto) {
		this.proto = proto;
	}

	public String getSrcIp() {
		return srcIp;
	}

	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
	}

	public String getSrcMac() {
		return srcMac;
	}

	public void setSrcMac(String srcMac) {
		this.srcMac = srcMac;
	}

	public String getSrc_port() {
		return src_port;
	}

	public void setSrc_port(String src_port) {
		this.src_port = src_port;
	}

	public int getSrcSwitchPort() {
		return srcSwitchPort;
	}

	public void setSrcSwitchPort(int srcSwitchPort) {
		this.srcSwitchPort = srcSwitchPort;
	}

	public Timestamp getStartedTime() {
		return startedTime;
	}

	public void setStartedTime(Timestamp startedTime) {
		this.startedTime = startedTime;
	}

	public String getSwitchId() {
		return switchId;
	}

	public void setSwitchId(String switchId) {
		this.switchId = switchId;
	}

	public BigInteger getTotalBytes() {
		return totalBytes;
	}

	public void setTotalBytes(BigInteger totalBytes) {
		this.totalBytes = totalBytes;
	}

	public int getVlan() {
		return vlan;
	}

	public void setVlan(int vlan) {
		this.vlan = vlan;
	}

	public String getVnet() {
		return vnet;
	}

	public void setVnet(String vnet) {
		this.vnet = vnet;
	}

	public int getVxlan() {
		return vxlan;
	}

	public void setVxlan(int vxlan) {
		this.vxlan = vxlan;
	}

}
