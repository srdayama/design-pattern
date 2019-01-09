package com.scp.Prototype;

public class PersonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
 
		Address ad = new Address(1234, "pune");
		Person p = new Person(11, "sheetal", ad);
		System.out.println(p);
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.maxMemory());
		System.out.println(r.freeMemory());
		
		Person p1 = (Person) p.clone();
		System.out.println(p==p1);
		System.out.println(p1);
		//p.setName("pooja");
		p.getAddress().setCity("Mumbai");
		System.out.println("......................................");
		
		System.out.println(p);
		System.out.println(p1); 
	}

}
