package com.scp.factoryPattern;

public abstract class Computer {
	public String ram;
	public String hdd;
	public String cpu;
	
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
	@Override
	public String toString() {
		return "Computer [RAM=" + getRAM() + ", HDD=" + getHDD() + ","
				+ " CPU=" + getCPU() + "]";
		
	}
	public Computer(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
    
    
    
    
    
}
