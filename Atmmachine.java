
package small;
import java.util.*;

public class Atmmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int balance=20000,withdraw,deposite,num;
Scanner sc=new Scanner(System.in);
while(true)
{
	System.out.println("welcome to ATM Machine");
	System.out.println("1.withdraw");
	System.out.println("2.Deposite");
	System.out.println("3.check balance");
	System.out.println("4.exit");
	num=sc.nextInt();
	switch(num)
	{
	case 1:
		System.out.println("enter amount to be withdraw");
		withdraw=sc.nextInt();
		if(balance>=withdraw)
		{
			balance=balance-withdraw;
			System.out.println("balance amount is:"+balance);
			System.out.println("please collect money");
		}
		else
		{
			System.out.println("you dont have enough money for withdraw");
		}
		System.out.println("");
		break;
	case 2:
		System.out.println("enter amount to deposite");
		deposite=sc.nextInt();
		balance=balance+deposite;
		System.out.println("balance amount is:"+balance);
		System.out.println("money has been deposited successfully");
		System.out.println(" ");
		break;
	case 3:
		System.out.println("balance of your account is:"+balance);
		System.out.println("");
		break;
	case 4:
		System.exit(0);
System.out.println("");		
		
	}
}
}

}
