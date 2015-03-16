
public class MainLocker {

	public static void main(String[] args) {
		
		Combination Mickey = new Combination(28, 17, 39);
		Locker MickeyMouse = new Locker(0, 100, "Mickey Mouse", Mickey);
		Combination Donald = new Combination(35, 16, 27);
		Locker DonaldDuck = new Locker(1, 275, "Donald Duck", Donald);
		
		MickeyMouse.openLocker();
		for (int i = 0; i < 3; i++)
		{
			MickeyMouse.putBooksInLocker();
		}
		
		DonaldDuck.removeBooksFromLocker();
		System.out.println();
		System.out.println(MickeyMouse);
		System.out.println();
		System.out.println();
		System.out.println(DonaldDuck);
	}
	
}
