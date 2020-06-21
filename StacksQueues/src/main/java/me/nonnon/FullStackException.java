package me.nonnon;

public class FullStackException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FullStackException() {
         this("Stack is full");
    }

    public FullStackException(String exception) {
         super(exception);
    }
}