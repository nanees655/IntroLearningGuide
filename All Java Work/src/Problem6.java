import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Problem6 {
	public static void main(String[] args ) {
		System.out.print("What are the x and y coordinates of point 1 and point 2?");
		
		int x1 = 3;
		int y1 = 4;
		
		int x2 = 5;
		int y2 = 8;
		
		
		System.out.print(" The x-coordinate of point 1 is ");
		System.out.print(x1);
		System.out.print(".");
		System.out.print(" The y-coordinate of point 1 is ");
		System.out.print(y1);
		System.out.print(".");
		System.out.print(" The x-coordinate of point 2 is " );
		System.out.print(x2);
		System.out.print(".");
		System.out.print(" The y-coordinate of point 2 is ");
		System.out.print(y2);
		System.out.print(".");
		
		
		double slope = x2 - x1 / y2 - y1;
		int slope1 = x2 - x1 / y2 - y1;
	 System.out.print("The slope is ");
	 System.out.print(slope);
	 
	 // Now I am unsure because the slope should be 0.5 but the program says it is 1.0
	 
	}
}
