package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		
		for(int x=1; x<=num; x++) {
			if(x%5==0) {
				count++;
				sum = sum+x;
			}
		}
		System.out.println("5의배수의 개수:"+count++);
		System.out.println("5의배수의 합: "+sum);
	}

}
