package test;

import java.util.Scanner;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String temp ="";
		while(true) {
			String str = s.nextLine();
			if(str.matches("^\\d+\\s\\d+\\s[/*-+]$")) {
				System.out.println(str);
				temp = str;
				break;
			}else {
				System.out.println("다시입력해주세요  "+str);
			}
		}
		
		
		
		
		/*
		 * 프로그램 로직(변수 검증) 할 때에는 try catch문으로
		 * 하지 말라.
		 */
		/*try {
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}*/

	}

}
