
public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("I Rule!");
		System.out.println("The World!");
		
//		int x = 4;
//		while (x > 3) {
//			x = x - 1;
//		}
		
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
