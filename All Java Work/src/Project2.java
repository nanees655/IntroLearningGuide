
public class Project2 {
	public static Turtle yertle;
	public static Turtle myrtle; 
	public <yertle> void setup() {
	size(600, 600);   //set the size of the window
	noLoop();
	background( 235 ); //set the background color
	}
	
	public static void main (String[] args){
	yertle = new Turtle(3);
    yertle.setThickness(6);
	
	
    yertle.forward(100);
	yertle.turnRight(90);
	}

	
	private void size(int i, int j) {
		//TODO Auto-generated method stub
		
	}

	private void noLoop() {
		//TODO Auto-generated method stub
		
	}

	private void background(int i) {
		// TODO Auto-generated method stub
	}
	
}
