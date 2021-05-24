package com.demo;

public class Main {

    public static void main(String[] args) {

        try {

            System.out.println("Before the download task is initiated current thread is "+Thread.currentThread().getName());

            var downloadTask = new Thread(new DownlodFileTask());
            downloadTask.start();

            System.out.println("Before join() is called "+Thread.currentThread().getName());
            downloadTask.join();
            System.out.println("After join() is called "+Thread.currentThread().getName());

            System.out.println("File download is complete "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
