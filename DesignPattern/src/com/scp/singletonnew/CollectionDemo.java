package com.scp.singletonnew;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class CollectionDemo {

	public static void main(String[] args) {
List l = new LinkedList();
List l1 = new ArrayList();
System.out.println(l instanceof Serializable);
System.out.println(l instanceof Cloneable );
System.out.println(l1 instanceof RandomAccess );
System.out.println(l instanceof RandomAccess );
	}

}
