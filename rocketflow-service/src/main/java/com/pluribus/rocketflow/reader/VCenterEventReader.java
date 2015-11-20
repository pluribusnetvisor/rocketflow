package com.pluribus.rocketflow.reader;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.pluribus.rocketflow.core.RocketFlowContext;
import com.pluribus.rocketflow.core.RocketFlowException;
import com.pluribus.rocketflow.core.EventReader;
import com.pluribus.rocketflow.event.VCenterEventBundle;
import com.pluribus.rocketflow.event.VCenterEventBundle.VCenterInfo;
import com.vmware.vim25.GuestNicInfo;
import com.vmware.vim25.mo.Folder;
import com.vmware.vim25.mo.InventoryNavigator;
import com.vmware.vim25.mo.ManagedEntity;
import com.vmware.vim25.mo.ServiceInstance;
import com.vmware.vim25.mo.VirtualMachine;

public class VCenterEventReader implements EventReader<VCenterEventBundle> {
	private String serviceUrl = "https://10.9.34.204/sdk";
	private String username = "administrator@lab.pluribus";
	private String password = "MyTest-456";

	private RocketFlowContext ctx;

	public VCenterEventReader(RocketFlowContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public VCenterEventBundle getEvent() throws RocketFlowException {
		try {
			ServiceInstance si = new ServiceInstance(new URL(serviceUrl), username, password, true);
			Folder rootFolder = si.getRootFolder();
			ManagedEntity[] entities = new InventoryNavigator(rootFolder).searchManagedEntities("VirtualMachine");
			List<VCenterInfo> vcis = new ArrayList<VCenterInfo>();

			for (ManagedEntity e : entities) {
				VirtualMachine vm = (VirtualMachine) e;
				String name = vm.getName();
				GuestNicInfo[] gnis = vm.getGuest().getNet();
				// vm.getGuest().getDynamicProperty()
				for (GuestNicInfo gni : gnis) {
					VCenterInfo vci = new VCenterInfo();
					vci.hostname = name;
					vci.mac = gni.getMacAddress();
					vcis.add(vci);
				}
			}

			VCenterEventBundle vce = new VCenterEventBundle(ctx, vcis);
			return vce;
		} catch (Exception ex) {
			throw new RocketFlowException(ex);
		}
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		String serviceUrl = "https://10.9.34.204/sdk";
		String username = "administrator@lab.pluribus";
		String password = "MyTest-456";
		ServiceInstance si = new ServiceInstance(new URL(serviceUrl), username, password, true);
		Folder rootFolder = si.getRootFolder();
		ManagedEntity[] entities = new InventoryNavigator(rootFolder).searchManagedEntities("VirtualMachine");

		for (ManagedEntity e : entities) {
			VirtualMachine vm = (VirtualMachine) e;
			String name = vm.getName();
			GuestNicInfo[] gnis = vm.getGuest().getNet();
			for (GuestNicInfo gni : gnis) {
				System.out.println(name + ":" + gni.macAddress);
			}
		}

	}

}
