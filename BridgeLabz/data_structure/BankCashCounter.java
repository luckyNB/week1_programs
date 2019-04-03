package com.bridgelabz.data_structure;
/**@author  :   Laxman Bhosale
 * @purpose :   Program for Banking Cash Counter...
 * @Date    :   07/03/2019
 * 
 * */
public class BankCashCounter {

	static int front = 0;
	static int rear = 0;
	public static final int MAXSIZE = 100;
	public static int bankBalance = 1000;
	public static int size = 0;
	public static int bankQueue[] = new int[100];

	/* static method for adding customers to the list */
	public static void enQueue(int range) {
		rear = rear + range;
		System.out.println("Persons are added in queue are:" + range);

	}
	/* static method for depositing money in the bank */
	public static void deposit(int amount) {
		System.out.println("Amount deposited is:" + amount);

		bankBalance += amount;
		size--;
		display();
	}

	/* static method withdraw money from the bank */
	public static void withdraw(int amount) {

		if (amount < bankBalance) {
			System.out.println("Amount withdrawn is ::" + amount);
			bankBalance -= amount;
			display();
		}

		else {
			System.out.println("Sorry! Insufficient Fund");
		}
	}

	/* static method for making transaction ie. deposit/withdraw money from bank */
	public static void deQueue() {

		if (rear < front) {
			System.out.println("Sorry! No one is in queue...........");
		} else {

			System.out.println("Enter 1. to deposite");
			System.out.println("Enter 2. to withdraw");
			int transation = Utility.inputInteger();
			if (transation == 1) {
				System.out.println("Enter the amount ");
				int amount = Utility.inputInteger();
				deposit(amount);

			} else if (transation == 2) {
				System.out.println("Enter the amount to be withdrawn:");
				int amount = Utility.inputInteger();
				withdraw(amount);
			}
			front++;
		}

	}

	/* static method for displaying money of Bank */
	public static void display() {
		System.out.println("Bank Balance::" + bankBalance);
	}

	/* static method for finding number of customers in the queue */
	public static void getSize() {
		System.out.println("Size of Queue is::" + (rear - front));

//	return ();

	}

	public static void main(String[] args) {
// BankCashCounter bankCashCounter=new BankCashCounter();
		int choice = 0;

		do {

			System.out.println();
			System.out.println("***************Banking Cash Counter**************");
			System.out.println("1.for adding the persons in the bank queue:");
			System.out.println("2.for perfoming transaction Withdraw/deposite");
			System.out.println("3.for checking number of people in the queue ");
			System.out.println("4.Exit");
			System.out.println();
			System.out.println("Enter your choice: ");

			choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				System.out.println("Enter the persons to be added to queue");
				enQueue(Utility.inputInteger());
				display();
				break;
			case 2:

				deQueue();

				System.out.println(" Your Available Balance is: ");
				display();
				break;
			case 3:
				getSize();
				// int j = getSize();
				// System.out.println("The Number of People in Queue is: " + j);
			case 4:
				System.exit(0);
			default:
				System.out.println("You entered wrong choice");
				break;

			}
		} while (choice < 5 || choice <= 0);

	}
}
