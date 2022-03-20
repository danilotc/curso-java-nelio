package estruturarepetitiva.testedemesafor;

public class TesteDeMesa8 {
	public static void main(String[] args) {
		int x = 8;
		int y = 3;
		
		for (int i=0; y < x; i++) {
			x -= 1; // x = x - 1
			y += 1; // y = y + 1
			System.out.println(i);
		}
	}
}