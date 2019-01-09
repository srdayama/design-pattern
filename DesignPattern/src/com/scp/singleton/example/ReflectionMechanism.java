package com.scp.singleton.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionMechanism {
	/*enum GFG{
		      obj;
	}*/
 public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 Singleton s1 = Singleton.obj;
	 Singleton s3 = Singleton.obj;
	 Singleton s2 = null;
	 Constructor[] cons = Singleton.class.getDeclaredConstructors();
	 for (Constructor constructor : cons) {
		 constructor.setAccessible(true);
		 s1 = (Singleton) constructor.newInstance();
		 s3  = (Singleton) constructor.newInstance();
		 break;
	}
	System.out.println(s1.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s2.hashCode());
	 
}
	  
	}

class Singleton  
{ 
     public static Singleton obj = new Singleton(); // public instance initialized when loading the class
      
    private Singleton()   // private constructor
    {         
    } 
} 

/*public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	  ReflectionMechanism instanceOne = ReflectionMechanism.getInstance();
	  ReflectionMechanism instanceTwo = null;
   
          Constructor[] constructors = ReflectionMechanism.class.getDeclaredConstructors();
          for (Constructor constructor : constructors) {
              //Below code will destroy the singleton pattern
              constructor.setAccessible(true);
              instanceTwo = (ReflectionMechanism) constructor.newInstance();
              break;
      }
      System.out.println(instanceOne.hashCode());
      System.out.println(instanceTwo.hashCode());
  }

private static ReflectionMechanism getInstance() {
	
	return null;
}
*/