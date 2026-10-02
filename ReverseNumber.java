package com.javaintroduction;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int original = num;
		int reverse = 0;
		while(num > 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("Original Number : " + original);
		System.out.println("Reverse Number : " + reverse);
		sc.close();
	}

}
