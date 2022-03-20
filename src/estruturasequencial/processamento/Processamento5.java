package estruturasequencial.processamento;

public class Processamento5 {
	public static void main(String[] args) {
		double a;
		int b;
		
		a = 5.0;
		b = (int) a; // Possível perda de valor decimal
		
		System.out.println(b);
	}
}