package com.scp.singletonnew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Test tt = Test.t;
		FileOutputStream fos = new FileOutputStream("my.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(tt);
		
		FileInputStream fis = new FileInputStream("my.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	Test ttt = 	(Test) ois.readObject();
	System.out.println(tt.hashCode());
	System.out.println(ttt.hashCode());
	}

}

class Test implements Serializable{
	public static Test t = new Test();

	private Test() {
		super();
	}
protected Object readResolve(){
	return t;
}
          
}
