package test07;

import java.util.Scanner;

public class condition {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 입력해:");
		String startNum =scan.nextLine();
		System.out.print("숫자2 입력해:");
		String endNum = scan.nextLine();
		System.out.printf("start:%s.end: %s,starNum.endNum");
		scan.close();
		
		int sNum = Integer.parseInt(startNum);
		int eNum = Integer.parseInt(endNum);
		
		if(sNum>eNum) {
		int tmp =sNum;
		sNum = eNum;
		eNum= tmp;			
		}
		for(int i = sNum;i<=eNum;i++) {
			System.out. println(i);
			scan. close();
		}
	}
	}

