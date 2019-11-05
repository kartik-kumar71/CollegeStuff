class Throw2
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
		Voter(19);
		System.out.println("Validation");
	}
}
		
			