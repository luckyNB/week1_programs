package com.bridgelabz.data_structure;
/**@author : Laxman Bhosale
 * @purpose: Program for finding out the number which are prime as well as anagram and both must be prime
 *            in the sectional matrix
 * @Date    : 05/03/2019 
 * */

public class PrimeTwoDInSectionalMatrix {

	public static int[][] prime2DArray(int n) {
		int[][] prime = new int[10][25];
		int first = 0, second = 0, third = 0, fourth = 0;
		int fifth = 0, sixth = 0, seventh = 0, eight = 0, nineth = 0, ten = 0;

		for (int i = 2; i < 1000; i++) {

			if (isPrime(i)) // checks number is prime or not
			{

				if ((i > 0) && (i <= 100))
					prime[0][first++] = i;

				else if ((i > 100) && (i <= 200))
					prime[1][second++] = i;

				else if ((i > 200) && (i <= 300))
					prime[2][third++] = i;

				else if ((i > 300) && (i <= 400))
					prime[3][fourth++] = i;

				else if ((i > 400) && (i <= 500))
					prime[4][fifth++] = i;

				else if ((i > 500) && (i <= 600))
					prime[5][sixth++] = i;

				else if ((i > 600) && (i <= 700))
					prime[6][seventh++] = i;

				else if ((i > 700) && (i <= 800))
					prime[7][eight++] = i;

				else if ((i > 800) && (i <= 900))
					prime[8][nineth++] = i;

				else if ((i > 900) && (i <= 1000)) {
					prime[9][ten++] = i;
				}
			}
		}

		return prime;

	}

	public static boolean isPrime(int n) {

		for (int j = 2; j <= n / 2; j++) {
			int rem = n % j;

			if (rem == 0) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
		int[][] arr = new int[10][25];

		arr = prime2DArray(1000);
		System.out.println("2D Matrix of Prime Numbers");

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 25; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
