package com.orthofx;

import java.io.IOException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class CalculatorException {

	private static Object arithmeticexception;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = s.nextInt();
		System.out.println("Enter the second number : ");
		int y = s.nextInt();
		System.out.println("Choose the arithmetic opperation to be done + - * /");
		char n = s.next().charAt(0);
		switch (n) {
		case '+':
			int add;
			add = x + y;
			System.out.println("Result : " + add);
			break;

		case '-':
			int sub;
			sub = x - y;
			System.out.println("Result : " + sub);
			break;

		case '*':
			int mul;
			mul = x * y;
			System.out.println("Result : " + mul);
			break;
			
		case '/':
			try {
			int div;
			
			div = x / y;
			System.out.print("Result : " + div);
			break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("invalid operation");
			}
			
			default:
				throw new RuntimeErrorException(null, "error");
		}
		
		 }
	}


