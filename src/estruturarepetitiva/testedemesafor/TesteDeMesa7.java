package estruturarepetitiva.testedemesafor;

public class TesteDeMesa7 {
	public static void main(String[] args) {
		int x = 4;
		int y = 0;
		
		for (int i=0; i < x; i++) {
			y = y + i; // y += i
		}
		System.out.println(y);
	}
}