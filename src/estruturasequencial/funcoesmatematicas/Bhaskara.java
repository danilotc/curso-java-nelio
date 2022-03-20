package estruturasequencial.funcoesmatematicas;

public class Bhaskara {
	public static void main(String[] args) {
		double a, b, c;
		double delta;
		double x1, x2;
		
		a = 1;
		b = 12;
		c = -13;
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}
}