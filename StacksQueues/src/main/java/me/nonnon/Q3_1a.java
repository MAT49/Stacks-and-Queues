package me.nonnon;

import java.util.EmptyStackException;

public class Q3_1a {
	// Describe how you could use a single array to implement three stacks

	private int numOfStacks = 3;
	private int stackCapacity;
	private int[] arr;
	private int[] arrSizes;
	
	public boolean isEmpty(int stackNum) {
		return arrSizes[stackNum] == 0;
	}
	
	public boolean isFull(int stackNum) {
		return arrSizes[stackNum] == stackCapacity;
	}
	
	public int indexOfTop(int stackNum) {
		int offset = stackNum * stackCapacity;
		int size = arrSizes[stackNum];
		return offset + size - 1;
	}
	
	public int peek(int stackNum) {
		if (isEmpty(stackNum)) {
			throw new EmptyStackException();
		}
		return arr[indexOfTop(stackNum)];
	}
	
	public void push(int stackNum, int value) throws FullStackException {
		if (isFull(stackNum)) {
			throw new FullStackException();
		}
		arrSizes[stackNum]++;
		arr[indexOfTop(stackNum)] = value;
	}
	
	public int pop(int stackNum) {
		if (isEmpty(stackNum)) {
			throw new EmptyStackException();
		}
		int value = arr[indexOfTop(stackNum)];
		arr[value] = 0;
		arrSizes[stackNum]--;
		return value;
	}
	
	
}
