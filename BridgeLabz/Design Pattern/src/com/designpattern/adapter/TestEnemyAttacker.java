package com.designpattern.adapter;

public class TestEnemyAttacker {
	public static void main(String[] args) {
		EnemyTank rx7Tank = new EnemyTank();
		EnemyRobot fredTheRobot = new EnemyRobot();
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		System.out.println("       The Robot");
		fredTheRobot.reactToHuman("Paul");
		fredTheRobot.walkForward();
		fredTheRobot.smashWithHands();
		
		System.out.println("       The enemy Tank");
		rx7Tank.assignDriver("Frank");
		rx7Tank.driveForward();
		rx7Tank.fireweapon();	
		
		robotAdapter.assignDriver("       Mark");
		robotAdapter.driveForward();
		robotAdapter.fireweapon();
	}
}
