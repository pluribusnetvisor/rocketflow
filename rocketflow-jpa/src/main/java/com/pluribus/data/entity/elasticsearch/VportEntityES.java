package com.pluribus.data.entity.elasticsearch;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.pluribus.data.entity.VportEntity;

/**
 * The persistent class for the vport database table.
 * 
 */
@Document(indexName = "fabric-vport", type = "vport", shards = 1, replicas = 0, refreshInterval = "60", indexStoreType = "fs")
public class VportEntityES implements VportEntity {
	@Id
	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String id;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String blockedPort;

	@Field(type = FieldType.String, store = false, index = FieldIndex.not_analyzed)
	private String config;

	@Field(type = FieldType.Long, store = true)
	private long configPort;

	@Field(type = FieldType.Date, store = true)
	private Date createTime;

	@Field(type = FieldType.Long, store = true)
	private long drop;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String hostname;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String hypervisor;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String ip;

	@Field(type = FieldType.Date, store = true)
	private Date lastSeen;

	@Field(type = FieldType.Long, store = true)
	private long localPort;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String mac;

	@Field(type = FieldType.Long, store = true)
	private long move;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String ownerL2Flags;

	@Field(type = FieldType.Long, store = true)
	private long ownerPort;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String peerL2Flags;

	@Field(type = FieldType.Long, store = true)
	private long peerPort;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String portFlags;

	@Field(type = FieldType.Long, store = true)
	private long rate;

	@Field(type = FieldType.Long, store = true)
	private long remId;

	@Field(type = FieldType.Long, store = true)
	private long remPort;

	@Field(type = FieldType.Long, store = true)
	private long switchId;

	@Field(type = FieldType.Integer, store = true)
	private int vlan;

	@Field(type = FieldType.Long, store = true)
	private long vmCpu;

	@Field(type = FieldType.Long, store = true)
	private long vmDisk;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String vmFlavor;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String vmId;

	@Field(type = FieldType.Long, store = true)
	private long vmMemory;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String vmName;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String vmOs;

	@Field(type = FieldType.Long, store = true)
	private long vxlan;

	@Field(type = FieldType.Date, store = true)
	private Date lastModified;

	@Field(type = FieldType.String, store = true, index = FieldIndex.not_analyzed)
	private String switchName;

	public VportEntityES() {
	}

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

	public long getConfigPort() {
		return configPort;
	}

	public void setConfigPort(long configPort) {
		this.configPort = configPort;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public long getDrop() {
		return drop;
	}

	public void setDrop(long drop) {
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

	public Date getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}

	public long getLocalPort() {
		return localPort;
	}

	public void setLocalPort(long localPort) {
		this.localPort = localPort;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public long getMove() {
		return move;
	}

	public void setMove(long move) {
		this.move = move;
	}

	public long getOwnerPort() {
		return ownerPort;
	}

	public void setOwnerPort(long ownerPort) {
		this.ownerPort = ownerPort;
	}

	public long getPeerPort() {
		return peerPort;
	}

	public void setPeerPort(long peerPort) {
		this.peerPort = peerPort;
	}

	public long getRate() {
		return rate;
	}

	public void setRate(long rate) {
		this.rate = rate;
	}

	public long getRemId() {
		return remId;
	}

	public void setRemId(long remId) {
		this.remId = remId;
	}

	public long getRemPort() {
		return remPort;
	}

	public void setRemPort(long remPort) {
		this.remPort = remPort;
	}

	public long getSwitchId() {
		return switchId;
	}

	public void setSwitchId(long switchId) {
		this.switchId = switchId;
	}

	public String getSwitchName() {
		return switchName;
	}

	public void setSwitchName(String switchName) {
		this.switchName = switchName;
	}

	public int getVlan() {
		return vlan;
	}

	public void setVlan(int vlan) {
		this.vlan = vlan;
	}

	public long getVmCpu() {
		return vmCpu;
	}

	public void setVmCpu(long vmCpu) {
		this.vmCpu = vmCpu;
	}

	public long getVmDisk() {
		return vmDisk;
	}

	public void setVmDisk(long vmDisk) {
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

	public long getVmMemory() {
		return vmMemory;
	}

	public void setVmMemory(long vmMemory) {
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

	public long getVxlan() {
		return vxlan;
	}

	public void setVxlan(long vxlan) {
		this.vxlan = vxlan;
	}

	public String getPortFlags() {
		return portFlags;
	}

	public void setPortFlags(String portFlags) {
		this.portFlags = portFlags;
	}

	public String getOwnerL2Flags() {
		return ownerL2Flags;
	}

	public void setOwnerL2Flags(String ownerL2Flags) {
		this.ownerL2Flags = ownerL2Flags;
	}

	public String getPeerL2Flags() {
		return peerL2Flags;
	}

	public void setPeerL2Flags(String peerL2Flags) {
		this.peerL2Flags = peerL2Flags;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "VportEntityES [id=" + id + ", blockedPort=" + blockedPort + ", config=" + config + ", configPort="
				+ configPort + ", drop=" + drop + ", hostname=" + hostname + ", hypervisor=" + hypervisor + ", ip=" + ip
				+ ", localPort=" + localPort + ", mac=" + mac + ", move=" + move + ", ownerL2Flags=" + ownerL2Flags
				+ ", ownerPort=" + ownerPort + ", peerL2Flags=" + peerL2Flags + ", peerPort=" + peerPort
				+ ", portFlags=" + portFlags + ", rate=" + rate + ", remId=" + remId + ", remPort=" + remPort
				+ ", switchId=" + switchId + ", vlan=" + vlan + ", vmCpu=" + vmCpu + ", vmDisk=" + vmDisk
				+ ", vmFlavor=" + vmFlavor + ", vmId=" + vmId + ", vmMemory=" + vmMemory + ", vmName=" + vmName
				+ ", vmOs=" + vmOs + ", vxlan=" + vxlan + "]";
	}



}