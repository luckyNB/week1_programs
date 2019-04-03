package com.designpattern.adapter;

import java.util.Random;

public class EnemyRobot {
Random random=new Random();

public void smashWithHands() {
	int attackDamage=random.nextInt(10)+1;
	System.out.println("Enemy Robot causes "+attackDamage+	"Damage with its Hands");
}


public void walkForward() {
int movement=random.nextInt(5)+1;
System.out.println("Enemy Robot walks Forward "+movement+" spaces");

}

public void reactToHuman(String driverName) {
		System.out.println("Enemy Robot Traps on"+driverName);
}
}