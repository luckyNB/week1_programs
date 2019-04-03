package com.designpattern.adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{
Random random=new Random();
	@Override
	public void fireweapon() {
		// TODO Auto-generated method stub
		int attackDamage=random.nextInt(10)+1;
		System.out.println("Enemy Tank does "+attackDamage+" Damage");
	}

	@Override
	public void driveForward() {
		
		int movement=random.nextInt(5)+1;
		System.out.println("Enemy Tank moves "+movement+" spaces");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignDriver(String driverName) {
		System.out.println(driverName+" is driving the tank");
		// TODO Auto-generated method stub
		
	}

}
