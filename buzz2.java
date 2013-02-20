class buzz2
{
	public static void main(String[] args)
		{
			
			for(int i=1;i<=100;i++)
				{
					System.out.println((i%15==0) ? "FIZZBUZZ" :(i%3==0)? "FIZZ":(i%5==0)?"Buzz":i);
				}
		}
}