public class fizz_buzz
{
public static void main(String args[])
	{
	for(int i=1;i<=30;i++)
		{
		if(i%15==0)
			{
			System.out.println("FIZZBUZZ");
			i++;
			}
		else if(i%5==0)
			{
			System.out.println("BUZZ");
			}
		else if(i%3==0)
			{
			System.out.println("FIZZ");
			}
		else
			System.out.println(i);
		}	
	}
}