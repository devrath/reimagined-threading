package com.demo;

public class Main {

    public static void main(String[] args) {
        try {

            System.out.println("The current thread is: " + Thread.currentThread().getName());

            var downloadFileTask = new Thread(new DownloadFileTask());
            downloadFileTask.start();

            System.out.println("The main thread is paused");
            Thread.sleep(5);
            downloadFileTask.interrupt();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
