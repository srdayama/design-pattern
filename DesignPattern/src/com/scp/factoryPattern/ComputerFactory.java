package com.scp.factoryPattern;
enum ComputerType{
	Pc,
	Server
}
public class ComputerFactory {
	

	public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu)
	{
		if(type!=null){
       if(ComputerType.Pc.toString().equals(type.toString())) 
    	    return new PC(ram, hdd, cpu);
		else if(ComputerType.Server.toString().equals(type.toString())) 
			 return new Server(ram, hdd, cpu);
		}
		return null;
	}

}
	