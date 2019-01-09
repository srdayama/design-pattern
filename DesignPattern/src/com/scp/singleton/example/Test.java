package com.scp.singleton.example;

import java.security.PublicKey;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.getInstance();
	}

//	private static final  Test t = new Test();//1st way
	private static   Test t;
	private Test() {}
	public static synchronized Test getInstance(){
		if(t==null){
		synchronized(Test.class){
		if(t==null){
		t = new Test();
		System.out.println("instance created");
	}
		}	
		}
		return t;}
	//2nd way
	/*static{
		try{
		t= new Test();
		}
		catch (Exception e) {
			throw new RuntimeException("Singleton Exception");
		}
	}
    
	public static Test getInstance(){
		return t;
	}
	*/
	//3rd way  //4th way is double checking
	/*public static synchronized Test getInstance(){
		if(t==null){
		synchronized(Test.class){
		if(t==null){
		t = new Test();
		System.out.println("instance created");
	}
		}	
		}
		return t;}*/
	//5th way
/*	private static class InnerClass{
	 private static final  Test t = new Test();	
	}
	
	public static  Test getInstance(){
		System.out.println("outer class obj");
		return InnerClass.t;
		
	
	}*/
	
	
}
