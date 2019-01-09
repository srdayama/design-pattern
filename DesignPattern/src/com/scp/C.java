package com.scp;


 class C{
  public static void main(String[] args) {
	System.out.println(m1());
}

  public static int m1()
	{
	  
		try {
			System.out.println("inside try block");
			//return 10;
		} catch (Exception e) {
			System.out.println("inside catch block");
		}
		finally {
			//return 20;
		}
		return 30;
	}
	 
 
	 
	

}