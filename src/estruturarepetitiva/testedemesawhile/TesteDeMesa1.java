package estruturarepetitiva.testedemesawhile;

public class TesteDeMesa1 {
	
	public static void main(String[] args) {
		int x = 0;
		int y = 4;
		
		while (x < 3) {
			y = y + 2; // y += 2
			x = x + 1; // x += 1
			System.out.println(x + "-" + y);
		}
	}
}