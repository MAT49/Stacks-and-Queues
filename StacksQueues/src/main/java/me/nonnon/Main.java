package me.nonnon;

public class Main {

	public static void main(String[] args) {
		MyStack<String> n = new MyStack<String>();
		n.push("first");
		n.push("second");
		System.out.println(n.isEmpty());

	}

}
