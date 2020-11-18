package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		int max = num;
		
		for(int y=0; y<=3; y++) {
			System.out.print("숫자: ");
			 num = sc.nextInt();
			 if(max<num) {
				 max=num;
			 }
		}
		System.out.println("최대값은 "+max+"입니다.");
		
		
		
		
		sc.close();
		
	}

}
