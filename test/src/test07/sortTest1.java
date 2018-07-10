package test07;

import java.util.Scanner;

public class sortTest1 {
	Scanner scan = new Scanner(System.in);{
	System.out.println("학생들의 점수를 , 로 구분하여입력!");
	String pointStr = scan.nextLine();
	scan.close();
	

	
	String[]arrStr = pointStr.split(".");
	int[] arrNum =new int[arrStr.length];
	for(int i=0; i<arrStr.length;i++) {
		arrNum[i] = Integer.parseInt(arrStr[i]);
		for(int i1=0; i1<arrNum.length;i1++) {
			for(int j=i1+1;j<arrNum.length;j++) {
				if(arrNum[i1]>arrNum[j]) {
					int tmp= arrNum[i1];
					arrNum[i1]=arrNum[j];
					arrNum[j]=tmp;
				}
			}System.out.println();
			System.err.println();
		}
		System.out.println(i);

	}
	}	
}
