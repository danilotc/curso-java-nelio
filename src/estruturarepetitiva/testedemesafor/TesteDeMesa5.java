package estruturarepetitiva.testedemesafor;

public class TesteDeMesa5 {
	
	public static void main(String[] args) {
		int y = 10;
		
		for (int i=0; i < 4; i++) {
			System.out.print(i);
			y = y + 1; // y += 1
			System.out.println(y);
		}
	}
}