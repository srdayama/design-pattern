package com.scp.Prototype;

import java.util.Date;
import java.util.List;

public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address1 a = new Address1(1212, "pune");
		StringBuffer sb = new StringBuffer("Delhi");
		//StringBuffer sb1 = new StringBuffer("MP");
		Date d1 = new Date(2018, 11, 1, 2, 12);
/*//	Employee e1 = new Employee(11, "sheetal", d1, 1212, sb, null, a);
		
	Employee e2 = (Employee) e1.clone();
 
	Date d2 = new Date(2018, 11, 1, 4, 12);
	e1.setDate(d2);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e1==e2);
	System.out.println(e1.getDate()==e2.getDate());
*/	
	//e1.setElocation("UK");
	
	
	/*System.out.println(e1);
	System.out.println(e2);
	*/
	
	
	/*System.out.println(e2);
	System.out.println(e1==e2);
	System.out.println(e1.getEname()==e2.getEname());
	System.out.println(e1.getAddress().getCity()==e2.getAddress().getCity());
	e1.getAddress().setCity("Mumbai");
	System.out.println(e1.getAddress().getCity()==e2.getAddress().getCity());
	System.out.println(e1.getAddress().getCity());
	System.out.println(e2.getAddress().getCity());*/
}
}
