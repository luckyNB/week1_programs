package com.designpattern.adapter;

public class EnemyRobotAdapter implements EnemyAttacker {
	EnemyRobot theRobot;
 
	
	public EnemyRobotAdapter(EnemyRobot newRobot) {
		theRobot = newRobot;
	}

	@Override
	public void fireweapon() {
		// TODO Auto-generated method stub
theRobot.smashWithHands();
	}

	@Override
	public void driveForward() {
		theRobot.walkForward();
		// TODO Auto-generated method stub

	}

	@Override
	public void assignDriver(String driverName) {
		theRobot.reactToHuman(driverName);
		// TODO Auto-generated method stub

	}

}
