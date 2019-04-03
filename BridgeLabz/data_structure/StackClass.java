package com.bridgelabz.data_structure;

public class StackClass {
	private int maxSize;
	private long[] stackArray;
	private int top;

	// for size
	public StackClass(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}

	// for pushing the element to the stack
	public void push(long j) {
		stackArray[++top] = j;
	}

	// for popping the element from the stack
	public long pop() {
		return stackArray[top--];
	}

	// for peeking the element from stack
	public long peek() {
		return stackArray[top];
	}

	// to check whether stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}

	// to check whether stack is full
	public boolean isFull() {
		return (top == maxSize - 1);
	}
}