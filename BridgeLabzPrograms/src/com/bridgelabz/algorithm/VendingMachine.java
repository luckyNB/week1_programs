package com.bridgelabz.algorithm;

/*
 * @author Laxman Bhosale


   @Purpose:  There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can  
              be returned by Vending Machine. Write a Program to calculate the minimum
	       number of Notes as well as the Notes to be returned by the Vending Machine 
	       as a Change
   @Date   :  13/02/2019
	 * 
	 *
	 ******************************************************************************/
import java.util.Scanner;

public class VendingMachine {

	// notes to be returned by vending machine

	public static void vendingMoney(int n) {
		int count = 0, count1000 = 0, count500 = 0, count100 = 0, count50 = 0, count20 = 0, count10 = 0, count5 = 0,
				count2 = 0, count1 = 0;
		while (n > 0) {
			if (n >= 1000) {
				n = n - 1000;
				count1000++;
			} else if (n >= 500) {
				n = n - 500;
				count500++;
			} else if (n >= 100) {
				n = n - 100;
				count100++;
			} else if (n >= 50) {
				n = n - 50;
				count50++;
			} else if (n >= 20) {
				n = n - 20;
				count20++;
			}

			else if (n >= 10) {
				n = n - 10;
				count10++;
			} else if (n >= 5) {
				n = n - 5;
				count5++;
			} else if (n >= 2) {
				n = n - 2;
				count2++;
			} else if (n >= 1) {
				n = n - 1;
				count1++;
			}

			count++;

		}
		System.out.println("minimum notes to be returned:" + count);
		if (count1000 != 0)
			System.out.println("1000 rs notes:" + count1000);
		if (count500 != 0)
			System.out.println("500 rs notes:" + count500);
		if (count100 != 0)
			System.out.println("100 rs notes:" + count100);
		if (count50 != 0)
			System.out.println("50 rs notes:" + count50);
		if (count20 != 0)
			System.out.println("20 rs notes:" + count20);
		if (count10 != 0)
			System.out.println("10 rs notes:" + count10);
		if (count5 != 0)
			System.out.println("5 rs notes:" + count5);
		if (count2 != 0)
			System.out.println("2 rs notes:" + count2);
		if (count1 != 0)
			System.out.println("1 rs notes:" + count1);
	}

	/**
	 * main method to test the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			Scanner s = new Scanner(System.in);

			System.out.println("enter amoumt");
			int value = s.nextInt();
			vendingMoney(value);
			// notes(value);
			s.close();
		}

		catch (Exception e) {
			System.out.println("enter value in integer");
		}
	}
}