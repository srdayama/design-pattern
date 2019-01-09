package com.scp.factoryPattern;

public class Server extends Computer {

	public Server(String ram, String hdd, String cpu) {
		super(cpu, cpu, cpu);
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}
	@Override
	public String getCPU() {
		return this.cpu;
	}
	
	
}
