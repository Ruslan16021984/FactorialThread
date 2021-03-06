package com.gmail.carbit3333333;

import java.math.BigInteger;

public class FactorialThread implements Runnable {
	private int number;

	public FactorialThread(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		System.out.println(th.getName() + " " + number + "!= " + calculateFactorial(number));

	}

	private BigInteger calculateFactorial(int number) {
		BigInteger fact = new BigInteger("1");
		for (int i = 2; i <= number; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		}

		return fact;
	}
}
