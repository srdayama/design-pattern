package com.scp.singleton.example;

import java.io.Serializable;
/**
 * single threaded environment but when it comes to multithreaded systems,
 *  it can cause issues if multiple threads are inside the if loop at the same time. 
 * @author SHEETAL
 *
 */
 public class LazyInstantiation  {
	 public static void main(String[] args) {
		 LazyInstantiation e1 = LazyInstantiation.getInstance();
		 LazyInstantiation e2 = LazyInstantiation.getInstance();
	}

	
 private static  LazyInstantiation obj =null ;
	private LazyInstantiation()
	{
		
	}
	
	/*public static LazyInstantiation getInstance()
	{
		if(obj == null){
			obj = new LazyInstantiation(); 
			}
		return obj;

		}
 */
	/**
	 *  initailly  object chect with null is not synchronized block get executed, 
		 next object will not be null, so only one object will be created
		 now it is thread safe coz we used synchronized
	 * @return
	 */
	/*
	 * block level synchronized Double checking (can ber break by reflection mechanism)*/
	  public static LazyInstantiation getInstance()
	{
		if(obj == null){
			synchronized(LazyInstantiation.class)  //
		  {
			if(obj == null)
			obj = new LazyInstantiation(); // instance will be created at request time
			System.out.println(obj.toString());
			System.out.println("Object creation when 1st  request come ");
		  }
		}
		return obj;
	}}
 
	//making method as synchronized
/*	public static synchronized LazyInstantiation getInstance()
	{
		if(obj == null)
			
			
			//if(obj == null)
			obj = new LazyInstantiation(); // instance will be created at request time
			System.out.println(obj.toString());
			System.out.println("Object creation when 1st  request come ");
		  
		
		return obj;
	}*/

 
 
