package com.bridgelabz.fuctional;

/*
* @author :  Laxman Bhosale 
* @purpose:  Program for getting probability of heads or tails depends upon number of 
*            times the coin is flipped.
* @Date   : 13/02/2019          
*/

public class CoinHeadOrTail {
	public static void main(String[] args) {
		System.out.println("Enter a number of tosses");

		int tosses = Utility.inputNumber();
		if (tosses > 0) {

			Utility.headOrTail(tosses);
		} else {
			System.out.println("Please! Enter greater value");
		}

	}
}
