package estruturarepetitiva.testedemesawhile;

public class TesteDeMesa2 {
	
	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		
		while (x > 2) {
			System.out.print(x);
			y = y + x; // y += x
			x = x - 1; // x -= 1
		}
	}
}