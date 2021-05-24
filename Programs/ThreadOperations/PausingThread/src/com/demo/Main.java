package com.demo;

public class Main {

    public static void main(String[] args) {
        // Start the worker thread
        var thread = new Thread(new DisplayMessage());
        thread.start();
    }
}
