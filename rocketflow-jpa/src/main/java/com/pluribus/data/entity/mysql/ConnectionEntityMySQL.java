package com.pluribus.data.entity.mysql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pluribus.data.entity.ConnectionEntity;

/**
 * The persistent class for the connection database table.
 *
 */
@Entity
@Table(name = "connection")
public class ConnectionEntityMySQL implements Serializable, ConnectionEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	private long age;

	@Column(name = "`curState`")
	private String curState;

	private int dscp;

	@Column(name = "`dstIp`")
	private String dstIp;

	@Column(name = "`dstMac`")
	private String dstMac;

	@Column(name = "`dstPort`")
	private long dstPort;

	@Column(name = "`dstSwitchPort`")
	private long dstSwitchPort;

	private long dur;

	@Column(name = "`endedTime`")
	private long endedTime;

	@Column(name = "`etherType`")
	private int etherType;

	@Column(name = "`fabric`")
	private String fabricName;

	private long ibytes;

	private long latency;

	private long obytes;

	private short proto;

	@Column(name = "`srcIp`")
	private String srcIp;

	@Column(name = "`srcMac`")
	private String srcMac;

	@Column(name = "`srcPort`")
	private long srcPort;

	@Column(name = "`srcSwitchPort`")
	private long srcSwitchPort;

	@Column(name = "`startedTime`")
	private long startedTime;

	@Column(name = "switch")
	private String switchName;

	@Column(name = "`totalBytes`")
	private long totalBytes;

	private String vnet;

	@Column(name = "`sFlowLocator`")
	private String flowLocator = "";

	@Column(name = "`sSrcHostname`")
	private String srcHostname = "";

	@Column(name = "`sDstHostname`")
	private String dstHostname = "";

	private long vlan;

	private long vxlan;

	public ConnectionEntityMySQL() {
	}

	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public long getAge() {
		return age;
	}

	@Override
	public void setAge(long age) {
		this.age = age;
	}

	@Override
	public String getCurState() {
		return curState;
	}

	@Override
	public void setCurState(String curState) {
		this.curState = curState;
	}

	@Override
	public int getDscp() {
		return dscp;
	}

	@Override
	public void setDscp(int dscp) {
		this.dscp = dscp;
	}

	@Override
	public String getDstIp() {
		return dstIp;
	}

	@Override
	public void setDstIp(String dstIp) {
		this.dstIp = dstIp;
	}

	@Override
	public String getDstMac() {
		return dstMac;
	}

	@Override
	public void setDstMac(String dstMac) {
		this.dstMac = dstMac;
	}

	@Override
	public long getDstPort() {
		return dstPort;
	}

	@Override
	public void setDstPort(long dstPort) {
		this.dstPort = dstPort;
	}

	@Override
	public long getDstSwitchPort() {
		return dstSwitchPort;
	}

	@Override
	public void setDstSwitchPort(long dstSwitchPort) {
		this.dstSwitchPort = dstSwitchPort;
	}

	@Override
	public long getDur() {
		return dur;
	}

	@Override
	public void setDur(long dur) {
		this.dur = dur;
	}

	@Override
	public int getEtherType() {
		return etherType;
	}

	@Override
	public void setEtherType(int etherType) {
		this.etherType = etherType;
	}

	@Override
	public String getFabricName() {
		return fabricName;
	}

	@Override
	public void setFabricName(String fabricName) {
		this.fabricName = fabricName;
	}

	@Override
	public long getIbytes() {
		return ibytes;
	}

	@Override
	public void setIbytes(long ibytes) {
		this.ibytes = ibytes;
	}

	@Override
	public long getLatency() {
		return latency;
	}

	@Override
	public void setLatency(long latency) {
		this.latency = latency;
	}

	@Override
	public long getObytes() {
		return obytes;
	}

	@Override
	public void setObytes(long obytes) {
		this.obytes = obytes;
	}

	@Override
	public short getProto() {
		return proto;
	}

	@Override
	public void setProto(short proto) {
		this.proto = proto;
	}

	@Override
	public String getSrcIp() {
		return srcIp;
	}

	@Override
	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
	}

	@Override
	public String getSrcMac() {
		return srcMac;
	}

	@Override
	public void setSrcMac(String srcMac) {
		this.srcMac = srcMac;
	}

	@Override
	public long getSrcPort() {
		return srcPort;
	}

	@Override
	public void setSrcPort(long srcPort) {
		this.srcPort = srcPort;
	}

	@Override
	public long getSrcSwitchPort() {
		return srcSwitchPort;
	}

	@Override
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

	@Override
	public String getSwitchName() {
		return switchName;
	}

	@Override
	public void setSwitchName(String switchName) {
		this.switchName = switchName;
	}

	@Override
	public long getTotalBytes() {
		return totalBytes;
	}

	@Override
	public void setTotalBytes(long totalBytes) {
		this.totalBytes = totalBytes;
	}

	@Override
	public String getVnet() {
		return vnet;
	}

	@Override
	public void setVnet(String vnet) {
		this.vnet = vnet;
	}

	@Override
	public String getFlowLocator() {
		return flowLocator;
	}

	@Override
	public void setFlowLocator(String flowLocator) {
		this.flowLocator = flowLocator;
	}

	@Override
	public String getSrcHostname() {
		return srcHostname;
	}

	@Override
	public void setSrcHostname(String srcHostname) {
		this.srcHostname = srcHostname;
	}

	@Override
	public String getDstHostname() {
		return dstHostname;
	}

	@Override
	public void setDstHostname(String dstHostname) {
		this.dstHostname = dstHostname;
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

	@Override
	public String toString() {
		return "ConnectionEntityMySQL [id=" + id + ", age=" + age + ", curState=" + curState + ", dscp=" + dscp
				+ ", dstIp=" + dstIp + ", dstMac=" + dstMac + ", dstPort=" + dstPort + ", dstSwitchPort="
				+ dstSwitchPort + ", dur=" + dur + ", endedTime=" + endedTime + ", etherType=" + etherType
				+ ", fabricName=" + fabricName + ", ibytes=" + ibytes + ", latency=" + latency + ", obytes=" + obytes
				+ ", proto=" + proto + ", srcIp=" + srcIp + ", srcMac=" + srcMac + ", srcPort=" + srcPort
				+ ", srcSwitchPort=" + srcSwitchPort + ", startedTime=" + startedTime + ", switchName=" + switchName
				+ ", totalBytes=" + totalBytes + ", vnet=" + vnet + ", flowLocator=" + flowLocator + ", srcHostname="
				+ srcHostname + ", dstHostname=" + dstHostname + ", vlan=" + vlan + ", vxlan=" + vxlan + "]";
	}




}