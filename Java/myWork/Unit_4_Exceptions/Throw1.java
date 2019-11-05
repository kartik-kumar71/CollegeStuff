class Throw1
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
		Voter(16);
		System.out.println("Validation");
	}
}
		
			