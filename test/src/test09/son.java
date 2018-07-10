package test09;

public class son extends Father{
	
	public void test() {
		System.out.println("아들의 테스트 함수");
		this. run();
		super. test ();
	}
	public static void main(String[]args) {
		son s = new son();
		s.test();
	}
}
