package com.bridgelabz.fuctional;

/*
* @author :  Laxman Bhosale 


* @purpose:  Program For getting the frequency of number of times winning or lossing bet 
 *           in this game player will achieve the goal or loose eveything every bet will be of 1$
 *           the number of time he will play the game  and probability winning or lossing will 
 *           be printed at the end.
* @Date   :  16/02/2019          
*/

public class Gambler {
	public static void main(String[] args) {

		double stake = 0, goals = 0;
		int times = 0;
		System.out.println("Enter stakes  and goals respectively");

		double win = 0, loss = 0;
		stake = Utility.inputNumber();

		goals = Utility.inputNumber();
		double r;
		int bets = 0;
		do {
			times++;
			r = Math.random();
			System.out.println(r);

			if (r > 0.5) {
				bets++;
				stake++;
				win++;
			} else {
				bets++;
				loss++;
				stake--;
			}

			if (stake == goals) {
				System.out.println("You won");

			}

			if (stake == 0) {
				System.out.println("You loss");

			}

		} while (stake != 0 || stake == goals);

		System.out.println("Wining percentage:" + (double) (win / bets) * 100);
		System.out.println("Loosing percentage:" + (double) (loss / bets) * 100);
		System.out.println("Number of times you have played::" + times);

	}

}
