class BankAccountDetails
{
	String name;
	int acc_no;
	double acc_bal;
	void set_detail(String a,int b,double c)
		{	
			name=a;
			acc_no=b;
			acc_bal=c;
			System.out.println("Name is "  +name);
			System.out.println("Account no is SBI"+acc_no);
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
public class AccountCreation
{
	public static void main(String[] args)
		{
			BankAccountDetails [] ob=new BankAccountDetails[20];
		for(int i=0;i<=9;i++)
			{
			ob[i]=new BankAccountDetails();
			ob[i].set_detail("Angel",430+i,100000.00);
			ob[i].deposit(3489.00);
			ob[i].withdraw(11113456.00);
			ob[i].change_name("Ashlesha");
			ob[i].check_bal();
			System.out.println();
			}
		}
}