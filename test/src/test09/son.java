package test09;

public class son extends Father{
	
	public void test() {
		System.out.println("�Ƶ��� �׽�Ʈ �Լ�");
		this. run();
		super. test ();
	}
	public static void main(String[]args) {
		son s = new son();
		s.test();
	}
}
