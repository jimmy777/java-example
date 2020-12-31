package com.x.base.exception;

public class ExceptionDemo1 {
	public void example(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e);
		}
		System.out.println("Result: " + result);
	}
}
