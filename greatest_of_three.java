public class greatest_of_three
{
public static void main(String args[])
	{
	int a=1,b=5,c=7,d=0;
	d=a>b?(a>c?a:c):(b>c?b:c);
	System.out.print("greatest of the three number is "+d);
	}
}