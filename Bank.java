class Bank_account
{
	String name,acc_no;
	double acc_bal;
	void set_detail(String a,String b,double c)
		{	
			name=a;
			acc_no=b;
			acc_bal=c;
			System.out.println("Name is "  +name);
			System.out.println("Account no is"  +acc_no);
			System.out.println("Account Balance is" +acc_bal);
		}
	void withdraw(double a)
		{
			if(a>acc_bal)
				{
					System.out.println("Insufficient amount");
					return;
				}
			else
				{
					acc_bal-=a;
					System.out.println("Account Balance is " +acc_bal);
				}
		}
	void deposit(double d)
		{
			acc_bal+=d;
			System.out.println("Account Balance is " +acc_bal);
		}
	void check_bal()
		{
			System.out.println("Account Balance is " +acc_bal);
		}
	void change_name(String a)
		{	
			name=a;
			System.out.println("name change to " +name);
		}
}
public class Bank
{
	public static void main(String[] args)
		{
			Bank_account ob=new Bank_account();
			ob.set_detail("Angel","SBI430",100000.00);
			ob.deposit(3489.00);
			ob.withdraw(11113456.00);
			ob.change_name("Ashlesha");
			ob.check_bal();
		}
}


/*float is of 32 bit but double is of 64 bits. Double is also for floating point number*/
/*ob is a referance variable to bank account*//*if a new obj is created then it is also a referance variable to bank account and it also contain name,acc_no and acc_
balance. Like this data hiding take place in java*/