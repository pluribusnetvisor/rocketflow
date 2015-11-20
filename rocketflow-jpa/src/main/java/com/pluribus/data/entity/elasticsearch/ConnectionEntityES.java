package com.pluribus.data.entity.elasticsearch;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.pluribus.data.entity.ConnectionEntity;

/**
 * The persistent class for the connection database table.
 *
 */
@Document(indexName = "nvos-connection", type = "connection", shards = 3, replicas = 0, refreshInterval = "60", indexStoreType = "fs")
public class ConnectionEntityES implements Serializable, ConnectionEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String id;

	@Field(type = FieldType.Long, store = true)
	private long age;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String curState;

	@Field(type = FieldType.Integer, store = true)
	private int dscp;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String dstIp;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String dstMac;

	@Field(type = FieldType.Long, store = true)
	private long dstPort;

	@Field(type = FieldType.Long, store = true)
	private long dstSwitchPort;

	@Field(type = FieldType.Long, store = true)
	private long dur;

	@Field(type = FieldType.Date, format=DateFormat.none, store = false, index = FieldIndex.not_analyzed)
	private long endedTime;

	@Field(type = FieldType.Integer, store = true)
	private int etherType;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String fabricName;

	@Field(type = FieldType.Long, store = true)
	private long ibytes;

	@Field(type = FieldType.Long, store = true)
	private long latency;

	@Field(type = FieldType.Long, store = true)
	private long obytes;

	@Field(type = FieldType.Integer, store = true)
	private short proto;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String srcIp;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String srcMac;

	@Field(type = FieldType.Long, store = true)
	private long srcPort;

	@Field(type = FieldType.Long, store = true)
	private long srcSwitchPort;

	@Field(type = FieldType.Date, store = false, format=DateFormat.none, index = FieldIndex.not_analyzed)
	private long startedTime;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String switchName;

	private long totalBytes;

	private long vlan;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String vnet;

	private long vxlan;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String flowLocator = "";

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String srcHostname = "";

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String dstHostname = "";

	@Field(type = FieldType.Long, store = true, index = FieldIndex.not_analyzed)
	private long throughput = 0;

	@Field(type = FieldType.Long, store = true, index = FieldIndex.not_analyzed)
	private long latencyUsec = 0;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String app = "";

	@Field(type = FieldType.String, store = false, index = FieldIndex.not_analyzed)
	private String startedTimeStr = "";

	@Field(type = FieldType.String, store = false, index = FieldIndex.not_analyzed)
	private String endedTimeStr = "";

	public ConnectionEntityES() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public long getDstPort() {
		return dstPort;
	}

	public void setDstPort(long dstPort) {
		this.dstPort = dstPort;
	}

	public long getDstSwitchPort() {
		return dstSwitchPort;
	}

	public void setDstSwitchPort(long dstSwitchPort) {
		this.dstSwitchPort = dstSwitchPort;
	}

	public long getDur() {
		return dur;
	}

	public void setDur(long dur) {
		this.dur = dur;
	}

	public int getEtherType() {
		return etherType;
	}

	public void setEtherType(int etherType) {
		this.etherType = etherType;
	}

	public String getFabricName() {
		return fabricName;
	}

	public void setFabricName(String fabricName) {
		this.fabricName = fabricName;
	}

	public long getIbytes() {
		return ibytes;
	}

	public void setIbytes(long ibytes) {
		this.ibytes = ibytes;
	}

	public long getLatency() {
		return latency;
	}

	public void setLatency(long latency) {
		this.latency = latency;
	}

	public long getObytes() {
		return obytes;
	}

	public void setObytes(long obytes) {
		this.obytes = obytes;
	}

	public short getProto() {
		return proto;
	}

	public void setProto(short proto) {
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

	public long getSrcPort() {
		return srcPort;
	}

	public void setSrcPort(long srcPort) {
		this.srcPort = srcPort;
	}

	public long getSrcSwitchPort() {
		return srcSwitchPort;
	}

	public void setSrcSwitchPort(long srcSwitchPort) {
		this.srcSwitchPort = srcSwitchPort;
	}

	public long getEndedTime() {
		return endedTime;
	}

	public void setEndedTime(long endedTime) {
		this.endedTime = endedTime;
	}

	public long getStartedTime() {
		return startedTime;
	}

	public void setStartedTime(long startedTime) {
		this.startedTime = startedTime;
	}

	public String getSwitchName() {
		return switchName;
	}

	public void setSwitchName(String switchName) {
		this.switchName = switchName;
	}

	public long getTotalBytes() {
		return totalBytes;
	}

	public void setTotalBytes(long totalBytes) {
		this.totalBytes = totalBytes;
	}


	public String getVnet() {
		return vnet;
	}

	public void setVnet(String vnet) {
		this.vnet = vnet;
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

	public String getFlowLocator() {
		return flowLocator;
	}

	public void setFlowLocator(String flowLocator) {
		this.flowLocator = flowLocator;
	}

	public String getSrcHostname() {
		return srcHostname;
	}

	public void setSrcHostname(String srcHostname) {
		this.srcHostname = srcHostname;
	}

	public String getDstHostname() {
		return dstHostname;
	}

	public void setDstHostname(String dstHostname) {
		this.dstHostname = dstHostname;
	}

	public long getThroughput() {
		return throughput;
	}

	public void setThroughput(long throughput) {
		this.throughput = throughput;
	}

	public long getLatencyUsec() {
		return latencyUsec;
	}

	public void setLatencyUsec(long latencyUsec) {
		this.latencyUsec = latencyUsec;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getStartedTimeStr() {
		return startedTimeStr;
	}

	public void setStartedTimeStr(String startedTimeStr) {
		this.startedTimeStr = startedTimeStr;
	}

	public String getEndedTimeStr() {
		return endedTimeStr;
	}

	public void setEndedTimeStr(String endedTimeStr) {
		this.endedTimeStr = endedTimeStr;
	}

	@Override
	public String toString() {
		return "ConnectionEntityES [id=" + id + ", age=" + age + ", curState=" + curState + ", dscp=" + dscp
				+ ", dstIp=" + dstIp + ", dstMac=" + dstMac + ", dstPort=" + dstPort + ", dstSwitchPort="
				+ dstSwitchPort + ", dur=" + dur + ", endedTime=" + endedTime + ", etherType=" + etherType
				+ ", fabricName=" + fabricName + ", ibytes=" + ibytes + ", latency=" + latency + ", obytes=" + obytes
				+ ", proto=" + proto + ", srcIp=" + srcIp + ", srcMac=" + srcMac + ", srcPort=" + srcPort
				+ ", srcSwitchPort=" + srcSwitchPort + ", startedTime=" + startedTime + ", switchName=" + switchName
				+ ", totalBytes=" + totalBytes + ", vlan=" + vlan + ", vnet=" + vnet + ", vxlan=" + vxlan
				+ ", flowLocator=" + flowLocator + ", srcHostname=" + srcHostname + ", dstHostname=" + dstHostname
				+ ", throughput=" + throughput + ", latencyUsec=" + latencyUsec + ", app=" + app + "]";
	}

}