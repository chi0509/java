package test12;
class coffee{
	
}
public class Minwoo {

	public void doEat() {
		System.out.println("¹Î¿ì¾¾°¡ ¹äÀ» ¸ÔÁö");
		
	}
	public coffee getCoffee(int money) {
		return new coffee();
	}
	public static void main (String[]args) {
		Minwoo mw = new Minwoo();
		mw.doEat();
		}
}
