package com.demo;

public class DisplayMessage implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Thread message is displayed in worker thread "+Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
