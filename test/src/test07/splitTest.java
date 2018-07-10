package test07;

import java.util.Scanner;

public class splitTest {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생등의 점수를,로"+"구분하여 입력하여주세여");
		String pointStr =scan.nextLine();
		String[]arrStr = pointStr.split(",");
		for(int i=0; i<arrStr .length;i++) {
			String str = (i+1)+"번째 학생:"+arrStr[i];
					System.out.println(str);
		}
		
	}			
	}

