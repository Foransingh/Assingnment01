class calculator
{
int add(int a,int b)
	{
	System.out.println(a+b);
	return (a+b);
	}
int sub(int a, int b)
	{
	System.out.println(a-b);
	return (a-b);
	}
}

public class calculator_test
{
public static void main(System args[])
	{
	calculator c=new calculator();
	calculator d=new calculator();
	c.add(5,3);
	d.add(5,3);
	}
}