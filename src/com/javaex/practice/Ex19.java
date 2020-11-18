package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int accountmoney = 0;
		while(flag) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고| 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("예금액>");
				int deposit = sc.nextInt();
				accountmoney=accountmoney + deposit;
				break;
			case 2:
				System.out.print("출금액>");
				int withdraw = sc.nextInt();
				accountmoney=accountmoney - withdraw;
				break;
			case 3:
				System.out.print("잔고액>");
				int balance = sc.nextInt(accountmoney);
				break;
			case 4:
				System.out.print("프로그램 종료");
				flag = false;
				break;
				
			default:
				System.out.print("다시입력해주세요");
				break;
			}
			System.out.println();
		}
			
		sc.close();
		}
	
	

}
