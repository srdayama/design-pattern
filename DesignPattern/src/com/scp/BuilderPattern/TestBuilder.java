package com.scp.BuilderPattern;

import com.scp.BuilderPattern.Phone.Mobile;

public class TestBuilder {

	public static void main(String[] args) {
        Phone p = new Phone.Mobile(11, "ios", 75000).setBleutooth(true).setSecured("yes its secured").build();
        
        System.out.println(p);
		
	}

}
