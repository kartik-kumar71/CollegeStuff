class Throw3
{
	static void Voter (int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("Not Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Eligible to vote");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			Voter(16);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
		
			