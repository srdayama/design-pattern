package com.scp.Prototype;

public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
      B b = new B();
          B b1= (B) b.clone();
          System.out.println(b==b1);
          System.out.println(b.getClass().getName());
          System.out.println(b1.getClass().getName());
          System.out.println(b.hashCode());
          System.out.println(b1.hashCode());
      
	}

}
class B implements Cloneable {
	int a;
//	String str;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	/*public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "B [a=" + a + ", str=" + str + "]";
	}
	public B(int a, String str) {
		super();
		this.a = a;
		this.str = str;
	}*/
	
}