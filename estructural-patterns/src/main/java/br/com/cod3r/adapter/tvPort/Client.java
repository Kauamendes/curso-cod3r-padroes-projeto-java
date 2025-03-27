package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.cod3r.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		final String IMAGE = "Cat and rainbow";
		final String SOUND = "Nyan cat song";

		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound(IMAGE, SOUND);

		System.out.println("\n------ Monitor ----------");

		Computer pc2 = new Computer();
		OldMonitor monitor = new OldMonitor();
		//pc2.connectPort(monitor);  //Don't work! That's the reason why we create the adapter
		pc2.connectPort(new HDMIToVGAAdapter(monitor));
		pc2.sendImageAndSound(IMAGE, SOUND);

		System.out.println("\n------ Monitor Class Adapter ----------");

		Computer pc3 = new Computer();
		HDMIToOldMonitorAdapter monitorAdaptee = new HDMIToOldMonitorAdapter();
		pc3.connectPort(monitorAdaptee);
		pc3.sendImageAndSound(IMAGE, SOUND);
	}
}
