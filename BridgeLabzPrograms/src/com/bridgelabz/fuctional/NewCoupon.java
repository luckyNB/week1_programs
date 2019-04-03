package com.bridgelabz.fuctional;

import com.bridgelabz.algorithm.Utility;

public class NewCoupon {

	public static int randomCouponsGeneration(int num)
	{
		boolean[] isDistinct = new boolean[num];
		int temp=0,count=0; 
		while(temp<num)
		{	
			int randomnumber = (int ) (Math.random()*num);   // return a random coupon between 0 and n-1
			count++;
			if(!isDistinct[randomnumber])  //not already present
			{
				temp++;
				isDistinct[randomnumber]=true;	//set generated distinct to true to avoid that no. again
				System.out.println("Distinct coupons are : "+randomnumber);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number ofCoupons");
		int num = Utility.inputNumber();
		randomCouponsGeneration(num);
	
	
		

	}
}
