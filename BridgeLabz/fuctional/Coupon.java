package com.bridgelabz.fuctional;

public class Coupon {
	public static int count = 0; // number of cards collected
	public static int distinctCoupon = 0; // number of distinct card types collected

	// return a random coupon between 0 and n-1
	public static int getCoupon(int n) {
		return (int) (Math.random() * n);
	}

	// return number of cards you collect before obtaining one of each of the n
	// types
	public static int collectCoupons(int n) {
		boolean[] isCollected = new boolean[n]; // isCollected[i] = true if card type i already collected

		// repeat until you've collected all n card types
		while (distinctCoupon < n) {
			// System.out.println("Coupon.collectCoupons()"+count);
			int value = getCoupon(n); // pick a random card
			count++; // one more card
			if (!isCollected[value]) { // discovered a new card type
				distinctCoupon++;
				// System.out.println("Coupon.collectCoupons()::distinct"+distinct);
				isCollected[value] = true;
			}
		}
		System.out.println("Distinct Coupans"+distinctCoupon);
		return count;
	}


	public static void main(String[] args) {
		System.out.println("Enter a number");
		int num = Utility.inputInteger();
		int count = collectCoupons(num);
		System.out.println(count);
		// System.out.println(distinctCoupon);
		System.out.println();
	}
}
