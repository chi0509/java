package test09;

public class InitTest {
	int n = 10;
	String str = "abc";
	InitTest(){
		
	}
	public static void main (String[]args) {
		InitTest it = new InitTest();
		InitTest it2 = new InitTest2();
		System.out.println(it.str=it2.str);
		String str ="abc";
		System.out.println(it.str=str);
		
	}
}
