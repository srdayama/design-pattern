package com.scp.AbstractFactoryMethod;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}

}
