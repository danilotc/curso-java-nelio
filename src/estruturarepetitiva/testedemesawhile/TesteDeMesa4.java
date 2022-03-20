package estruturarepetitiva.testedemesawhile;

public class TesteDeMesa4 {
	
	public static void main(String[] args) {
		double x = 100.0;
		double y = 100.0;
		
		while (x != y) {
			System.out.print("Olha");
			x = Math.sqrt(y); // Compilador exige que x seja do tipo double
		}
	}
}