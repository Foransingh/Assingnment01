public class sum_of_digits
{
public static void main(String args[])
	{
	int sum=0,num=199;
	while(num!=0)
		{
		sum=sum+num%10;
		num=num/10;
		}
	System.out.print("sum of digits are "+sum);
	}
}