package me.nonnon;

public class MyStack<T> {
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			this.data = data;
		}
	}
	private StackNode<T> top;
	
}
