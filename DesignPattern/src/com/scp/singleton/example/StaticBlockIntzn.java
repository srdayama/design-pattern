package com.scp.singleton.example;

/**
 *  static block initialization creates the instance even before it’s being used 
 *  and that is not the best practice to use
 * @author SHEETAL
 *
 */
public class StaticBlockIntzn {

	 public static void main(String[] args) {
		 StaticBlockIntzn e1 = StaticBlockIntzn.getInstance();
		 System.out.println(e1.hashCode());
		 StaticBlockIntzn e2 = StaticBlockIntzn.getInstance();
		 System.out.println(e2.hashCode());
	}
	 private  StaticBlockIntzn()
	 {
		 
	 }
	 private static final StaticBlockIntzn obj;
	 
	    static {
	               obj = new StaticBlockIntzn();
	           }
	 
	    public static StaticBlockIntzn getInstance() {
	    	System.out.println("hi........");
	        return obj;
	    }
}
																																																																																																																																																																																																																																														