package test01;

public class condition {

	public static void main(String[] arg) {
		boolean b1 = 1==1;
		
		if(b1) {
			System.out.println("1��1�� �翬�� ���� ��û��!");
		}else {
			System.out.println("1��1�� �ٸ��� ���̵�??");
			
		}
		
		int age = 23;
		if(age>=40){
			System.out.println("40�뱺��");
		}else if (age>=30) {
			System.out.println("30�뱺��");
		}else if (age>=20) {
			System.out.println("30�뱺��");
		}else if(age>=20) {
			System.out.println("10�뱺��");
		}else {
			System.out.println("������!!");
		}
	}
}
