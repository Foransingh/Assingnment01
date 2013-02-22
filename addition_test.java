class addition
{
	int sum=0;
	void add()
	{
	for(int i=1;i<10000;i++)
		{
		int temp=i;
		while(temp!=0)
			{
		int num=0,count=0;
			while(temp%10!=0)
				{
				num=(temp%10)+power(10,count)+num;
				count++;
				temp=temp/10;
				}
		if(temp%10==0)
			{
			temp=temp/10;
			}	
		sum=sum+num;
			}
		}
	System.out.println("sum is "+sum);
	}
	int power(int base,int p)
	{	
	if(p==0)
		{
		return 1;
		}
	for(int i=1;i<=p;i++)
		{
		p=p*base;
		}
	return p;
	}
}
class addition_test
{
public static void main(String args[])
	{
	addition a=new addition();
	a.add();
	}
}