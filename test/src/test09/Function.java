package test09;

public class Function {

	static void print(String str) {
		System.out.println(str);
	}
	static void sum(int num1,int num2) {
		System.out.println(num1+num2);
	}
	static int getNum(){
		return 0;
//		void x 
	}
	public static void main(String[]args) {
		sum(2,0);
		String str= getNum()+"";
		System.out.println(str);
		
		}
	}

