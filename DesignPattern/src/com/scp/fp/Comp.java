package com.scp.fp;

public abstract class Comp {


private   String HDD = null;
private   String RAM = null;
private   String CPU = null;

public abstract String getRAM();
public abstract String getHDD();
public abstract String getCPU();

@Override
public String toString() {
	return "Comp [HDD=" + HDD + ", RAM=" + RAM + ", CPU=" + CPU + "]";
}

	
}
