package com.scp.interview.scenario;

public class OverloadingScenario {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 =s1;
		s1+="d";
		System.out.println(s1+" "+s2+" "+(s1==s2));
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1+" "+sb2+" "+(sb1==sb2));
		
		
		/*int x =2;
		if(x=2){
			System.out.println("inside if loop");
		}*/
		
		
		
		
		
		/*short s = 0;
		int a =07;
		int bb = 08;
		int c = 123456;
		System.out.println(bb);*/
		
		
		
		
		//test(null);
		if(null==null){
			System.out.println("inside if loop");
		}
	}

	/*public static void test(Exception e){
		System.out.println("Exception");
	}
	public static void test(ArithmeticException ae){
		System.out.println("ArithmeticException");
	}
	public static void test(Object i){
		System.out.println("Object");
	}*/
}
