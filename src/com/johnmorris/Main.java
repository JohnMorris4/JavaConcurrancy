package com.johnmorris;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        System.out.println("Again from the Main thread");
    }
}
