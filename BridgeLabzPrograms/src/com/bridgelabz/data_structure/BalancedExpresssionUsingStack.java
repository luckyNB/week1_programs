
package com.bridgelabz.data_structure;
/**@author  :   Laxman Bhosale
 * @purpose :   Program for checking the expression is balanced or not...
 * @Date    :   06/03/2019
 * 
 * */
public class BalancedExpresssionUsingStack {

	public static void main(String[] args) {

		/* Creating Stack */
		StackClass stack = new StackClass((15));
		System.out.println();
		System.out.println("Parenthesis Matching");
		System.out.println();
		

		/* Accepting expression */
		//System.out.println("Enter expression: ");
		String exp = "((5+6)∗(7+8)/(4+3(5+6)))";
		int len = exp.length();
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++) {
			char ch = exp.charAt(i);

			if (ch == '(') {
				stack.push(i);// if opening bracket then push into stack
			} else if (ch == ')') {
				try {
					long p = (stack.pop() + 1);// if closing bracket then pop from stack
					//System.out.println(p);
					System.out.println("')' at index " + (i + 1) + " matched with '(' at index " + p);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("')' at index " + (i + 1) + " is unmatched");
				}
			}
		}
		while (!stack.isEmpty()) {
			System.out.println("'(' at index " + (stack.pop() + 1) + " is unmatched");
		}
	}
}