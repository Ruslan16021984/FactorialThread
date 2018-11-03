package com.gmail.carbit3333333;

public class Main {

	public static void main(String[] args) {
//		Thread one = new Thread(new FactorialThread(20));
//		one.start();
//		System.out.println(Thread.currentThread().getName() + " is Stop");
		Thread[] a = new Thread[100];
		for (int i = 0; i < a.length; i+=1) {
			a[i]= new Thread(new FactorialThread(i));
		}
		for (int i = 0; i < a.length; i+=1) {
			a[i].start();
		}
		System.out.println(Thread.currentThread().getName() + "is Stop");
	}

}
