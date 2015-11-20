package com.pluribus.rocketflow.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NvosConnection {
	@JsonProperty("vlan")
	private long vlan;

	@JsonProperty("vxlan")
	private long vxlan;

	@JsonProperty("vnet")
	private String vnet;

	@JsonProperty("proto")
	private String proto;

	@JsonProperty("dur")
	private long dur;

	@JsonProperty("age")
	private long age;

	@JsonProperty("cur-state")
	private String curState;

	@JsonProperty("obytes")
	private long outBytes;

	@JsonProperty("dst-port")
	private int dstPort;

	@JsonProperty("ether-type")
	private String etherType;

	@JsonProperty("dscp")
	private String dscp;

	@JsonProperty("time")
	private String time;

	@JsonProperty("start-time")
	private String startTime;

	@JsonProperty("end-time")
	private String endTime;

	@JsonProperty("duration")
	private long duration;

	@JsonProperty("interval")
	private long interval;

	@JsonProperty("count")
	private long count;

	@JsonProperty("src-switch-port")
	private long srcSwitchPort;

	@JsonProperty("dst-switch-port")
	private long dstSwitchPort;

	@JsonProperty("src-mac")
	private String srcMac;

	@JsonProperty("dst-mac")
	private String dstMac;

	@JsonProperty("src-ip")
	private String srcIp;

	@JsonProperty("dst-ip")
	private String dstIp;

	@JsonProperty("src-port")
	private int srcPort;

	@JsonProperty("latency")
	private long latency;

	@JsonProperty("ibytes")
	private long inputBytes;

	@JsonProperty("total-bytes")
	private long totalBytes;

	@JsonProperty("started-time")
	private String startedTime;

	@JsonProperty("ended-time")
	private String endedTime;

	@JsonProperty("transition-state")
	private String transitionState;

	@JsonProperty("within-last")
	private int withinLast;

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

	public String getVnet() {
		return vnet;
	}

	public void setVnet(String vnet) {
		this.vnet = vnet;
	}

	public String getProto() {
		return proto;
	}

	public void setProto(String proto) {
		this.proto = proto;
	}

	public long getDur() {
		return dur;
	}

	public void setDur(long dur) {
		this.dur = dur;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getCurState() {
		return curState;
	}

	public void setCurState(String curState) {
		this.curState = curState;
	}

	public long getOutBytes() {
		return outBytes;
	}

	public void setOutBytes(long outBytes) {
		this.outBytes = outBytes;
	}

	public String getEtherType() {
		return etherType;
	}

	public void setEtherType(String etherType) {
		this.etherType = etherType;
	}

	public String getDscp() {
		return dscp;
	}

	public void setDscp(String dscp) {
		this.dscp = dscp;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public long getInterval() {
		return interval;
	}

	public void setInterval(long interval) {
		this.interval = interval;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getSrcSwitchPort() {
		return srcSwitchPort;
	}

	public void setSrcSwitchPort(long srcSwitchPort) {
		this.srcSwitchPort = srcSwitchPort;
	}

	public long getDstSwitchPort() {
		return dstSwitchPort;
	}

	public void setDstSwitchPort(long dstSwitchPort) {
		this.dstSwitchPort = dstSwitchPort;
	}

	public String getSrcMac() {
		return srcMac;
	}

	public void setSrcMac(String srcMac) {
		this.srcMac = srcMac;
	}

	public String getDstMac() {
		return dstMac;
	}

	public void setDstMac(String dstMac) {
		this.dstMac = dstMac;
	}

	public String getSrcIp() {
		return srcIp;
	}

	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
	}

	public String getDstIp() {
		return dstIp;
	}

	public void setDstIp(String dstIp) {
		this.dstIp = dstIp;
	}

	public int getDstPort() {
		return dstPort;
	}

	public void setDstPort(int dstPort) {
		this.dstPort = dstPort;
	}

	public int getSrcPort() {
		return srcPort;
	}

	public void setSrcPort(int srcPort) {
		this.srcPort = srcPort;
	}

	public long getLatency() {
		return latency;
	}

	public void setLatency(long latency) {
		this.latency = latency;
	}

	public long getInputBytes() {
		return inputBytes;
	}

	public void setInputBytes(long inputBytes) {
		this.inputBytes = inputBytes;
	}

	public long getTotalBytes() {
		return totalBytes;
	}

	public void setTotalBytes(long totalBytes) {
		this.totalBytes = totalBytes;
	}

	public String getStartedTime() {
		return startedTime;
	}

	public void setStartedTime(String startedTime) {
		this.startedTime = startedTime;
	}

	public String getEndedTime() {
		return endedTime;
	}

	public void setEndedTime(String endedTime) {
		this.endedTime = endedTime;
	}

	public String getTransitionState() {
		return transitionState;
	}

	public void setTransitionState(String transitionState) {
		this.transitionState = transitionState;
	}

	public int getWithinLast() {
		return withinLast;
	}

	public void setWithinLast(int withinLast) {
		this.withinLast = withinLast;
	}

	@Override
	public String toString() {
		return "NvosConnection [vlan=" + vlan + ", vxlan=" + vxlan + ", vnet=" + vnet + ", proto=" + proto + ", dur="
				+ dur + ", age=" + age + ", curState=" + curState + ", outBytes=" + outBytes + ", dstPort=" + dstPort
				+ ", etherType=" + etherType + ", dscp=" + dscp + ", time=" + time + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", duration=" + duration + ", interval=" + interval + ", count=" + count
				+ ", srcSwitchPort=" + srcSwitchPort + ", dstSwitchPort=" + dstSwitchPort + ", srcMac=" + srcMac
				+ ", dstMac=" + dstMac + ", srcIp=" + srcIp + ", dstIp=" + dstIp + ", srcPort=" + srcPort + ", latency="
				+ latency + ", inputBytes=" + inputBytes + ", totalBytes=" + totalBytes + ", startedTime=" + startedTime
				+ ", endedTime=" + endedTime + ", transitionState=" + transitionState + "]";
	}

}