//$Id$
package week3.day1;

public class Calculator {

	public void add(int a , int b)

	{
		System.out.println("The Addition value is "+(a+b));
	}

	public void add(int a , int b, int c)

	{
		System.out.println("The Addition value is "+(a+b+c));
	}

	public void sub(int a , int b)

	{
		System.out.println("The Subtraction value is "+(a-b));
	}

	public void sub(double a , double b)

	{
		System.out.println("The Subtraction value is "+(a-b));
	}

	public void multiply(int a , int b)

	{
		System.out.println("The Multiplication value is "+(a*b));
	}

	public void multiply(double a , int b)

	{
		System.out.println("The Multiplication value is "+(a*b));
	}



	public static void main(String[] args)

	{
		Calculator calc = new Calculator();
		calc.add(4, 5);
		calc.add(5,6,7);
		calc.sub(15, 5);
		calc.sub(25.75, 14.25);
		calc.multiply(16,14);
		calc.multiply(10.50, 10);


	}

}
