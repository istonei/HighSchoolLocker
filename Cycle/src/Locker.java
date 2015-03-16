import java.util.Scanner;


public class Locker {
	
	Scanner keyboard = new Scanner(System.in);
	private int putBookInLocker;
	private int lockerNumber;
	private String name;
	private Combination Combination1 = new Combination();
	
	public Locker()
	{
		lockerNumber = 0;
		putBookInLocker = 0;
		name = " ";
		Combination1.setInput1(0);
		Combination1.setInput2(0);
		Combination1.setInput3(0);
		Combination1.setDial(0);
	}
	public Locker(int pBIL, int LN, String n, Combination C1)
	{
		super();
		this.lockerNumber = LN;
		this.putBookInLocker = pBIL;		
		this.name = n;
		this.Combination1 = C1;		
	}
	public int getLockerNumber()
	{
		return lockerNumber;
	}
	public void setLockerNumber(int LN)
	{
		this.lockerNumber = LN;
	}
	public int getPutBookInLocker()
	{
		return putBookInLocker;
	}
	public void setPutBookInLocker(int pBIL)
	{
		this.putBookInLocker = pBIL;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public Combination getCombination()
	{
		return Combination1;
	}
	public void setCombination(Combination C1)
	{
		this.Combination1 = C1;
	}
	public void putBooksInLocker()
	{
		putBookInLocker++;
	}
	public boolean removeBooksFromLocker()
	{
		if (putBookInLocker > 0)
		{
			putBookInLocker--;
			return true;
		}
		else
			return false;
	}
	public void openLocker()
	{
		System.out.println("" + name);
		System.out.println("Enter ticks to the left");
		int one = keyboard.nextInt();
		System.out.println("Enter ticks to the right");
		int two = keyboard.nextInt();
		System.out.println("Enter ticks to the left");
		int three = keyboard.nextInt();
		
		if (Combination1.openLock(one, two, three) == true)
		{
			System.out.println("Correct combination. Locker is opened");
		}
		else
			System.out.println("Incorrect combination.");
		
	}
	public String toString()
	{
		return "Your locker number is " + lockerNumber + "\n"
				+ "Book count: " + putBookInLocker + "\n" + "Your name: "
				+ name + "\n" + Combination1.toString();
	}
	
}
