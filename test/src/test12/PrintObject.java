package test12;

public class PrintObject {
String str = "poStr";
	
public String toString() {
	return "�� Ŭ������ str�̶� ������ " +str+"�̶�� ���� ������ ����";
}
	public static void main (String[]agrs) {
	String str = "str";
	System.out.println(str);
	PrintObject po = new PrintObject();
	System.out.println(po.toString());
	}
}
