package test01;

public class condition {

	public static void main(String[] arg) {
		boolean b1 = 1==1;
		
		if(b1) {
			System.out.println("1과1은 당연히 같지 멍청아!");
		}else {
			System.out.println("1과1이 다른게 말이되??");
			
		}
		
		int age = 23;
		if(age>=40){
			System.out.println("40대군요");
		}else if (age>=30) {
			System.out.println("30대군요");
		}else if (age>=20) {
			System.out.println("30대군요");
		}else if(age>=20) {
			System.out.println("10대군요");
		}else {
			System.out.println("젊은이!!");
		}
	}
}
