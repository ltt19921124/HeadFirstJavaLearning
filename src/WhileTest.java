
public class WhileTest {

	public static void main(String[] args) {
		
		
		int y = 1;
		System.out.println("Before the loop");
		while (y < 4) {
			System.out.println("In the loop");
			System.out.println("Value of y is" + y);
			y = y + 1;
		}
		System.out.println("This is after the loop");
	}

}
