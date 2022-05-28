//$Id$
package week3.day1;

public class Students 

{

	public void getStudentInfo()
	{
		System.out.println("This is StudentInfo method without any Parameters");
	}

	public void getStudentInfo(int ID)
	{
		System.out.println("The ID number is"+ID);
	}

	public void getStudentInfo(int ID, String Name)
	{
		System.out.println("The ID number is "+ID +" and the name is " +Name);
	}


	public void getStudentInfo(String EmailID, String PhoneNum)
	{
		System.out.println("The Email ID number is "+EmailID +" and the Phonenumber is " +PhoneNum);
	}

	public static void main(String[] args)

	{
		Students s = new Students();
		s.getStudentInfo();
		s.getStudentInfo(2318);
		s.getStudentInfo(2318, "RAJESHWARAN");
		s.getStudentInfo("varanrajesh@gmail.com", "12133313");


	}

}
