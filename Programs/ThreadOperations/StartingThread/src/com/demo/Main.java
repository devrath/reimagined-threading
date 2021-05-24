package com.demo;

public class Main {

    public static void main(String[] args) {
	    var displayMessage = new Thread(new DisplayMessage());
        System.out.println("Before thread starts, current thread is "+ Thread.currentThread().getName());
	    displayMessage.start();
    }
}
