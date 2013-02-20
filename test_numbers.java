class numbers
{
	boolean prime_number(int a)
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
			return false;
			}
		}
		return true;
	}
}
class test_numbers
{
	public static void main(String args[])
	{
	numbers n1=new numbers();
	if(n1.prime_number(15))
		{
		System.out.println("prime number");
		}
	else
		System.out.println("not prime");
	}
}
/*we don't need == in if becoz by default here if will be true if we
are calling a funtion returning boolean value*/