package com.scp.singleton.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestDemoCont {

	public static void main(String[] args) {

		Test t = Test.getInstance();
		Test t1 = null;
		Constructor[] cons = Test.class.getDeclaredConstructors();
		for (Constructor c : cons) {
			c.setAccessible(true);
		 try {
			t1=(Test) c.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		}
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());

	}

}
