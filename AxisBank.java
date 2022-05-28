//$Id$
package week3.day1;

public class AxisBank extends BankInfo

{
	public void Deposit()
	{
		System.out.println("This is a Deposit account from AxisBank Class");
	}

	public static void main(String[] args) 
	{
		AxisBank AB = new AxisBank();
		AB.Deposit();


	}
}
