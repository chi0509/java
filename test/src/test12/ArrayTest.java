package test12;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("���ڸ� 1���� 5���� �� 1���� �Է����ּ���");
	String numStr = scan.nextLine();
	int num = Integer.parseInt(numStr);
	if(num==1) {
		System.out.println("����� �����°� �����ϴ� Ÿ���̱���!");
	}else if(num==2) {
		System.out.println("����� �ڿ��� �����ϴ°� ���ϴ±���!");
	}else if(num==3) {
		System.out.println("����� ���Ϳ� ����� �ֱ���!");
	}else if(num==4) {
		System.out.println("����� ���� Ÿ���̱���!");
	}else if(num==5) {
		System.out.println("�ѱ� ����? 1���� 5������ �Է��϶��!");
	}
	System.out.println("�ϰ� �Է��� ����:"+numStr);
	}
}
