package com.demo;

public class DownlodFileTask implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("File is downloading in "+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
