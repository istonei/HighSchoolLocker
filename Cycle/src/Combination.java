
public class Combination {
	
	private int input1;
	private int input2;
	private int input3;
	private int dial;
	
	public Combination(int input1, int input2, int input3, int dial)
	{
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
		this.dial = dial;
	}	
	public Combination()
	{
		input1 = 0;
		input2 = 0;
		input3 = 0;
	}
	public Combination(int i1, int i2, int i3)
	{
		super();
		this.input1 = i1;
		this.input2 = i2;
		this.input3 = i3;
	}
	public int getInput1()
	{
		return input1;
	}
	public void setInput1(int i1)
	{
		this.input1 = i1;
	}
	public int getInput2()
	{
		return input2;
	}
	public void setInput2(int i2)
	{
		this.input2 = i2;
	}
	public int getInput3()
	{
		return input3;
	}
	public void setInput3(int i3)
	{
		this.input3 = i3;
	}
	public int getDial()
	{
		return dial;
	}
	public void setDial(int d)
	{
		this.dial = d;
	}
	public void resetDial()
	{
		dial = 0;
	}
	public void turnRight(int ticks)
	{
		dial = (40 - (ticks-dial)) % 40;
	}
	public void turnLeft(int ticks)
	{
		dial = ((ticks + dial) + 40) % 40;
	}
	public boolean openLock(int one1, int two1, int three1)
	{
		turnLeft(one1);
		if(dial == input1)
		{
			turnRight(two1);
			if(dial == input2)
			{
				turnLeft(three1);
				if(dial == input3)
					return true;
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}
	public String toString()
	{
		return "Combination: " + input1 + " " + input2 + " " + input3;
	}
}

