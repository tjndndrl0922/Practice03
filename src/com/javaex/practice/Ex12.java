package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int result=1;
		
		for(int x=num; x>0; x=x-1) {
			result*=x;
		}
		System.out.println("결과값: "+result);
		sc.close();
		
	}

}
