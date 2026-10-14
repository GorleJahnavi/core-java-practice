package com.javaintroduction;

import java.util.Scanner;

public class PrimeNumbers {
	
	static boolean isPrime(int n) {
		boolean flag = true;
		if(n==0 || n == 1) {
			flag = false;
		}
		for(int i = 2; i<=n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			if(isPrime(i)) {
				System.out.println(i + " ");
			}
		}
	}

}
