
public class Problem8 {

	public static void main(String[] args ) {
//Use quadratic formula to find solutions of a quadratic equation

		double a = 3;
		double b = 2;
		double c = -19;
		
		double x1 = 0;
		double x2 = 0;
		
	x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
	x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
		System.out.println("x1 = " +x1);
		System.out.println("x2 = " +x2);
		
		}

}

