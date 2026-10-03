package com.javaintroduction;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int original = num;
		int remainder = 0;
		int reverse = 0;
		while(num>0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		if(reverse == original) {
			System.out.println(original + " is a palindrome");
		}else {
			System.out.println(original +" is not a palindrome");
		}
	
	}

}
