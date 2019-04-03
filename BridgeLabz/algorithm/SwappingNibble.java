package com.bridgelabz.algorithm;

/****************************************************************************************
 * @author : Laxman Bhosale
 * @purpose: Program for swapping the nubble of byte in this program the number
 *           is taken as input from user and converted into binary then the
 *           nibble of byte is swapped and after swapping the nibble the number
 *           is converted into decimal and printed
 * @Date : 13/02/2019
 ******************************************************************************************/

public class SwappingNibble

{

	public static void main(String[] args) {

		try {

			System.out.println("enter a no");

			int[] binary = Utility.decimalToBinary(Utility.inputNumber());
			System.out.println("binary is ");
			Utility.showArr(binary);

			Utility.swapNibbles(binary);
			System.out.println("after swapping ");
			Utility.showArr(binary);
			int swapDec = Utility.binaryToDecimal(binary);
			System.out.println("decimal of swapped binary is " + swapDec);

		} catch (Exception e) {
			System.out.println("enter input as integer ");
		}

	}
}