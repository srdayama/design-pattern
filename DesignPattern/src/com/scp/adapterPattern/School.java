package com.scp.adapterPattern;
import com.scp.adapterPattern.PilotPen;;
public class School {

	public static void main(String[] args) {
		Pen p =  new PilotPen();
   AssignmentWork aw = new AssignmentWork();
   aw.setP(p);
   aw.writeAssignment("i need to write assignment");
	}

}
