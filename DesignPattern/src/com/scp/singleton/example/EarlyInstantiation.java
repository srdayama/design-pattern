package com.scp.singleton.example;

public class EarlyInstantiation {

	//static 
	 public static void main(String[] args) {
		 EarlyInstantiation e1 = EarlyInstantiation.getInstance();
		 EarlyInstantiation e2 = EarlyInstantiation.getInstance();
	}
	private static EarlyInstantiation  obj = new EarlyInstantiation();
	private EarlyInstantiation()
	{
		
	}
	
	public static EarlyInstantiation getInstance()
	{
		System.out.println("hi......");
		return obj;
	}
}
