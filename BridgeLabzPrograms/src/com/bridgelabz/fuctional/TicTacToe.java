package com.bridgelabz.fuctional;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	static String[] board = new String[9];
	static String turn = "X";
	static String winner = null;
	static int z = 0;

	public static void displayboard() {
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
	}

	static void populateE() {
		for (int i = 0; i < 9; i++) {
			board[i] = String.valueOf(i + 1);
		}
	}

	public static String checkWinner() {
		for (int i = 0; i < 8; i++) {
			String line = null;
			switch (i) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "Person";
			} else if (line.equals("000")) {
				return "Computer";
			}
		}
		for (int i = 0; i < 9; i++) {
			if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
				break;
			} else if (i == 8) {
				return "draw";
			}
			// System.out.println(turn+"'s turn , please enter the number of "+turn+" in:");
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random(9);
		populateE();

		System.out.println("Welcome to 2 Player Tic Tac Toe");
		displayboard();
		System.out.println("X will play first.");
		while (winner == null) {
			int numInput;
			try {

				numInput = sc.nextInt();

				for (int i = 0; i < 9; i++) {
					z = rd.nextInt(9);
				}

				System.out.println("value By Computer: " + z);
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("Invalid input, re-enter slot number");
					continue;
				}
			} catch (Exception e) {
				System.out.println("Invalid input, re-enter slot number");
				continue;
			}
			if (numInput != z) {

				if (board[numInput - 1].equals(String.valueOf(numInput)) || board[z - 1].equals(String.valueOf(z))) {

					// person turn
					board[numInput - 1] = turn;

					if (turn.equals("X")) {
						turn = "0";
					} else {
						turn = "X";
					}
					// computer turn
					board[z - 1] = turn;

					if (turn.equals("0")) {
						turn = "X";
					} else {
						turn = "0";
					}
					displayboard();
					winner = checkWinner();
				} else {
					System.out.println("Please re-enter the valid input");
					continue;
				}
			} else {
				System.out.println("Repeated value generated");
			}
		}
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("Draw Match. Thanks for playing");
		} else
			System.out.println("Congratulations." + winner + "you Won.");
		sc.close();
	}

}