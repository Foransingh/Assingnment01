class mathpro
{
	int fact(int n)
	{
		if(n==0)
			return 1;
		else
		
			return (n*fact(n-1));
		
	}
	int power(int base,int pow)
	{ 	
		int c=1;
 		if(pow==0)
		return c;
		else

		{
			for(int i=1;i<=pow;i++)
			{ 
 				c=base*c;
			}
				return c;
		}
	 }
	int sqrt(int n)
	{
		int i=1,sqr=1;
		while(sqr<n)
		{
			sqr=i*i;
			i++;
		}
		return (i-1);	
	}	
	int cubrt(int n)
	{	int i=1,cube=1;
		while(cube<n)
		{
			cube=i*i*i;
			i++;
		}
		return (i-1);
	}
	double sine(int x)
	{	int j=1,sign=1;
		double c=0.00;
		for(int i=0;i<5;i++)
		{	  
			 
			 c+=(sign*power(x,j))/fact(j);
				 j+=2;
			
			sign*=-1;
		}
		return c;
	}
	double cosine(int x)
	{	int j=0,sign=1;
		double c=0.00;
		for(int i=0;i<5;i++)
		{	  
			 
			 c+=(sign*power(x,j))/fact(j);
				 j+=2;
			
			sign*=-1;
		}
		return c;
	}
			

}

class math_test
{	
	public static void main(String[] args)
		{
			mathpro m=new mathpro();
			System.out.println(m.fact(5));
			System.out.println(m.power(125,2));
			System.out.println(m.sqrt(625));
			System.out.println(m.cubrt(27));
			System.out.println(m.sine(60));
			System.out.println(m.cosine(30));
		}

}
























