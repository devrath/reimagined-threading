package com.demo;

public class DownloadFileTask implements Runnable {

    @Override
    public void run() {

        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for (int i=0 ; i<Integer.MAX_VALUE ; i++) {
            if(Thread.currentThread().isInterrupted()){
                System.out.println("The "+Thread.currentThread().getName()+" is interrupted");
                return;
            }
            System.out.println("Downloading bytes "+i+" in thread: "+Thread.currentThread().getName());
        }

        System.out.println("Downloading complete: " + Thread.currentThread().getName());

    }

}
