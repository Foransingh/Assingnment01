public class upper_lower
{
public static void main(String args[])
	{
	char ch='N';
	if(ch>='A' && ch <='Z')
		{
		ch=(char)(ch+('a'-'A'));
		System.out.println("conversion result is "+ch);
		}
	else
		{
		ch=(char)(ch-('a'-'A'));
		System.out.println("conversion result is "+ch);
		}
	}
}


/* if(c>'A'&& c<='Z')
{
c=char(c+32)
}*/