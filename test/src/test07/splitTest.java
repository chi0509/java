package test07;

import java.util.Scanner;

public class splitTest {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�л����� ������,��"+"�����Ͽ� �Է��Ͽ��ּ���");
		String pointStr =scan.nextLine();
		String[]arrStr = pointStr.split(",");
		for(int i=0; i<arrStr .length;i++) {
			String str = (i+1)+"��° �л�:"+arrStr[i];
					System.out.println(str);
		}
		
	}			
	}

