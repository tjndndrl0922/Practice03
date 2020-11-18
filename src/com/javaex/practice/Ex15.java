package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int y=1; y<=num; y++) {
			if(num%y==0) {
				System.out.println(y);
			}
		} 
		
		sc.close();
	}
}
