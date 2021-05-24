package com.demo;

public class DisplayMessage implements Runnable {
    @Override
    public void run() {
        System.out.println("A message is displayed on the "+ Thread.currentThread().getName());
    }
}
