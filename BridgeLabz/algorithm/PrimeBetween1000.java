package com.bridgelabz.algorithm;
/*
* @author :  Laxman Bhosale 
* @purpose:  Program for printing prime numbers between 1 to 1000.
* @Date   : 13/02/2019          
*/
import java.util.ArrayList;


public class PrimeBetween1000 {
	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();//for storing prime numbers list
		list = Utility.getPrimeNumber();
		System.out.println(list);
	}

}
