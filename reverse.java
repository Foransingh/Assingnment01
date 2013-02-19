public class reverse
{
public static void main(String args[])
	{
	int num=128,rev=0,new_num=0;
	while(num!=0)
	{
	rev=num%10;
	num=num/10;
	new_num=new_num*10+rev;
	}
	System.out.println("reverse of the number is "+new_num);
	}
}