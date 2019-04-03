package com.dp.adapterSchool;

public class School {
public static void main(String[] args) {
	Pen pen=new PenAdapter();
	AssignmentWork assignmentWork=new AssignmentWork();
	assignmentWork.setPen(pen);
	assignmentWork.writeAssignment("I m little bit tired to write an assignment");
}
}
