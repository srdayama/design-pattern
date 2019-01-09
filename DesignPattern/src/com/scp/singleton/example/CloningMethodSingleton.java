package com.scp.singleton.example;

public class CloningMethodSingleton {
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton1 s1 = Singleton1.obj; 
	    Singleton1 s2 = (Singleton1) s1.clone(); 
	    System.out.println("instance1 hashCode:- "+ s1.hashCode()); 
	    System.out.println("instance2 hashCode:- "+ s2.hashCode());  
	}
}

//JAVA code to explain cloning issue with singleton 
/*class SuperClass implements Cloneable{
	int i=10;
	@Override
	protected Object clone() throws CloneNotSupportedException{ 
		
		return super.clone();
	}
}*/
//class Singleton1 extends SuperClass{
	class Singleton1 implements Cloneable{
	public static Singleton1 obj = new Singleton1();
		private Singleton1(){}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			//return super.clone();
			//return new CloneNotSupportedException();
			return obj;
		}
}