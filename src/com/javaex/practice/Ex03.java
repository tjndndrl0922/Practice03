package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		//별 3개가 4줄로 생김
		
		int x, y;
		for(x=0; x<4; x++) {
			for(y=2; y>=0; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
