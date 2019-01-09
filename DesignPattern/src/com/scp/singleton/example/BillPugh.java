package com.scp.singleton.example;

public class BillPugh {
	public static void main(String[] args) {
		BillPugh b1 = BillPugh.getInstance();
		System.out.println(b1.hashCode());
		BillPugh b2 = BillPugh.getInstance();
		System.out.println(b2.hashCode());
	}
	 private BillPugh(){}
	    
	    private static class SingletonHelper{
	        private static final BillPugh obj = new BillPugh();
	    }
	    
	    public static BillPugh getInstance(){
	    	System.out.println("hi...");
	        return SingletonHelper.obj;

}
}

