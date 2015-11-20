package com.pluribus.data.entity.mysql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.pluribus.data.entity.VportEntity;

/**
 * The persistent class for the vport database table.
 * 
 */
@Entity
@Table(name = "vport")
public class VportEntityMySQL implements Serializable, VportEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column(name="`blocked-port`")
	private String blockedPort;

	private String config;

	@Column(name="`config-port`")
	private long configPort;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="`create-time`")
	private Date createTime;

	@Column(name="`drop`")
	private long drop;

	private String hostname;

	private String hypervisor;

	private String ip;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="`last-seen`")
	private Date lastSeen;

	@Column(name="`local-port`")
	private long localPort;

	private String mac;

	private long move;

	@Column(name="`owner-l2-flags`")
	private String ownerL2Flags;
	
	@Column(name="`owner-port`")
	private long ownerPort;

	@Column(name="`peer-l2-flags`")
	private String peerL2Flags;
	
	@Column(name="`peer-port`")
	private long peerPort;
	
	@Column(name="`port-flags`")
	private String portFlags;

	private long rate;

	@Column(name="`rem-id`")
	private long remId;

	@Column(name="`rem-port`")
	private long remPort;

	@Column(name="`switch-id`")
	private long switchId;

	private int vlan;

	@Column(name="`vm-cpu`")
	private long vmCpu;

	@Column(name="`vm-disk`")
	private long vmDisk;

	@Column(name="`vm-flavor`")
	private String vmFlavor;

	@Column(name="`vm-id`")
	private String vmId;

	@Column(name="`vm-memory`")
	private long vmMemory;

	@Column(name="`vm-name`")
	private String vmName;

	@Column(name="`vm-os`")
	private String vmOs;

	private long vxlan;

	public VportEntityMySQL() {
	}

	
	@Override
	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	
	@Override
	public String getBlockedPort() {
		return blockedPort;
	}

	
	@Override
	public void setBlockedPort(String blockedPort) {
		this.blockedPort = blockedPort;
	}

	
	@Override
	public String getConfig() {
		return config;
	}

	
	@Override
	public void setConfig(String config) {
		this.config = config;
	}

	
	@Override
	public long getConfigPort() {
		return configPort;
	}

	
	@Override
	public void setConfigPort(long configPort) {
		this.configPort = configPort;
	}

	
//	@Override
	public Date getCreateTime() {
		return createTime;
	}

	
//	@Override
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	
	@Override
	public long getDrop() {
		return drop;
	}

	
	@Override
	public void setDrop(long drop) {
		this.drop = drop;
	}

	
	@Override
	public String getHostname() {
		return hostname;
	}

	
	@Override
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	
	@Override
	public String getHypervisor() {
		return hypervisor;
	}

	
	@Override
	public void setHypervisor(String hypervisor) {
		this.hypervisor = hypervisor;
	}

	
	@Override
	public String getIp() {
		return ip;
	}

	
	@Override
	public void setIp(String ip) {
		this.ip = ip;
	}

	
//	@Override
	public Date getLastSeen() {
		return lastSeen;
	}

	
//	@Override
	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}

	
	@Override
	public long getLocalPort() {
		return localPort;
	}

	
	@Override
	public void setLocalPort(long localPort) {
		this.localPort = localPort;
	}

	
	@Override
	public String getMac() {
		return mac;
	}

	
	@Override
	public void setMac(String mac) {
		this.mac = mac;
	}

	
	@Override
	public long getMove() {
		return move;
	}

	
	@Override
	public void setMove(long move) {
		this.move = move;
	}

	
	@Override
	public long getOwnerPort() {
		return ownerPort;
	}

	
	@Override
	public void setOwnerPort(long ownerPort) {
		this.ownerPort = ownerPort;
	}

	
	@Override
	public long getPeerPort() {
		return peerPort;
	}

	
	@Override
	public void setPeerPort(long peerPort) {
		this.peerPort = peerPort;
	}

	
	@Override
	public long getRate() {
		return rate;
	}

	
	@Override
	public void setRate(long rate) {
		this.rate = rate;
	}

	
	@Override
	public long getRemId() {
		return remId;
	}

	
	@Override
	public void setRemId(long remId) {
		this.remId = remId;
	}

	
	@Override
	public long getRemPort() {
		return remPort;
	}

	
	@Override
	public void setRemPort(long remPort) {
		this.remPort = remPort;
	}

	
	@Override
	public long getSwitchId() {
		return switchId;
	}

	
	@Override
	public void setSwitchId(long switchId) {
		this.switchId = switchId;
	}

	
	@Override
	public int getVlan() {
		return vlan;
	}

	
	@Override
	public void setVlan(int vlan) {
		this.vlan = vlan;
	}

	
	@Override
	public long getVmCpu() {
		return vmCpu;
	}

	
	@Override
	public void setVmCpu(long vmCpu) {
		this.vmCpu = vmCpu;
	}

	
	@Override
	public long getVmDisk() {
		return vmDisk;
	}

	
	@Override
	public void setVmDisk(long vmDisk) {
		this.vmDisk = vmDisk;
	}

	
	@Override
	public String getVmFlavor() {
		return vmFlavor;
	}

	
	@Override
	public void setVmFlavor(String vmFlavor) {
		this.vmFlavor = vmFlavor;
	}

	
	@Override
	public String getVmId() {
		return vmId;
	}

	
	@Override
	public void setVmId(String vmId) {
		this.vmId = vmId;
	}

	
	@Override
	public long getVmMemory() {
		return vmMemory;
	}

	
	@Override
	public void setVmMemory(long vmMemory) {
		this.vmMemory = vmMemory;
	}

	
	@Override
	public String getVmName() {
		return vmName;
	}

	
	@Override
	public void setVmName(String vmName) {
		this.vmName = vmName;
	}

	
	@Override
	public String getVmOs() {
		return vmOs;
	}

	
	@Override
	public void setVmOs(String vmOs) {
		this.vmOs = vmOs;
	}

	
	@Override
	public long getVxlan() {
		return vxlan;
	}

	
	@Override
	public void setVxlan(long vxlan) {
		this.vxlan = vxlan;
	}
	
	
	@Override
	public String getPortFlags() {
		return portFlags;
	}

	
	@Override
	public void setPortFlags(String portFlags) {
		this.portFlags = portFlags;
	}

	
	
	
	@Override
	public String getOwnerL2Flags() {
		return ownerL2Flags;
	}

	
	@Override
	public void setOwnerL2Flags(String ownerL2Flags) {
		this.ownerL2Flags = ownerL2Flags;
	}

	
	@Override
	public String getPeerL2Flags() {
		return peerL2Flags;
	}

	
	@Override
	public void setPeerL2Flags(String peerL2Flags) {
		this.peerL2Flags = peerL2Flags;
	}

	
	public String toString() {
		return "VportEntity [id=" + id + ", blockedPort=" + blockedPort + ", config=" + config + ", configPort="
				+ configPort + ", createTime=" + createTime + ", drop=" + drop + ", hostname=" + hostname
				+ ", hypervisor=" + hypervisor + ", ip=" + ip + ", lastSeen=" + lastSeen + ", localPort=" + localPort
				+ ", mac=" + mac + ", move=" + move + ", ownerL2Flags=" + ownerL2Flags + ", ownerPort=" + ownerPort
				+ ", peerL2Flags=" + peerL2Flags + ", peerPort=" + peerPort + ", portFlags=" + portFlags + ", rate="
				+ rate + ", remId=" + remId + ", remPort=" + remPort + ", switchId=" + switchId + ", vlan=" + vlan
				+ ", vmCpu=" + vmCpu + ", vmDisk=" + vmDisk + ", vmFlavor=" + vmFlavor + ", vmId=" + vmId
				+ ", vmMemory=" + vmMemory + ", vmName=" + vmName + ", vmOs=" + vmOs + ", vxlan=" + vxlan + "]";
	}


}