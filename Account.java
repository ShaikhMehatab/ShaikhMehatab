import java.util.Scanner;
public class Account {
	
	private int accno;
	private String name;
	private long bal;
	
	Scanner KB = new Scanner(System.in);
	
	//method to open an account
	void openacc()
	{
		System.out.println("Enter Account Number:");
		accno=KB.nextInt();
		System.out.println("Enter Account Holder Name:");
		name=KB.nextLine();
		System.out.println("Enter Balance:");
		bal=KB.nextLong();
	}
	
	//method to display account details
	void showAccount()
	{
		System.out.println(accno + "," +name+ "," +bal);
	}
	
	//method to withdraw money
	void withdraw()
	{
		long amt;
		System.out.println("Enter Amount You Want To Withdraw:");
		amt= KB.nextLong();
		if (bal>=amt)
		{
			bal=bal-amt;
		}
		else
		{
			System.out.println("Ohhh! You Having Less Balance!");
		}
	}
	//method to deposit money
		void deposit()
		{
			long amt;
			System.out.println("Enter Amount You Want To Deposit:");
			amt= KB.nextLong();
			bal=bal+amt;
		}
	System.out.println("1.Open Account\n 2. Show account\n 3. Deposite\n 4. Withdraw\n 5. Exit");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deposite d=new deposit();
		d.deposit(bal);
		openacc oa=new openacc()
		oa.openacc();
		showAccpunt sa=new showAccount()
		sa.showAccount();
		withdraw w=new withdraw();
		w.withdraw(bal);

	}

}
