package test01;

public class ClassTest {
	String name;
	int count;
	
	void test() {
		   System.out.println(name);
		   }
	void test1() {
		 System.out.println(count);
		}
	public static void main(String[] args) {
	    ClassTest ct = new ClassTest();	
	    ct.name = "ȫ�浿";
	    
	    ClassTest ct1 = new ClassTest();	
	    System.out.println(ct.name);
	    System.out.println(ct.count);
	    
	}
}
