package com.scp.factoryPattern;

 class TestFactory {

	public static void main(String[] args) {
		//Computer comp1 = ComputerFactory.getComputer(ComputerType.Pc, "16 GB", "1 TB", "2.8 Gz");
		Computer comp1 = ComputerFactory.getComputer(null, "16 GB", "1 TB", "2.8 Gz");
		PC pc = (PC) comp1;
		Computer comp2 = ComputerFactory.getComputer(ComputerType.Server, "1 GB", "2TB", "44Gz");
		Server server = (Server) comp2;
		
		System.out.println("PC config " + pc);
		System.out.println("Server config " + server);
            	}
}
