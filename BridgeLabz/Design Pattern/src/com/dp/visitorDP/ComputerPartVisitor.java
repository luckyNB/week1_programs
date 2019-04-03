package com.dp.visitorDP;

public interface ComputerPartVisitor {
 public  void visit(Computer computer) ;
	// TODO Auto-generated method stub
	

 public void visit(Mouse mouse);
 public void visit(Keybord keybord);
 public void visit(Monitor monitor);
	
}
