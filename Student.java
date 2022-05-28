//$Id$
package week3.day1;

public class Student extends Department

{
	public void StudentName()
	{
		System.out.println("Name of the Student is Rajeshwaran");
	}

	public void StudentDept()
	{
		System.out.println("Department of the Student is CSE");
	}

	public void StudentID()
	{
		System.out.println("ID of the Student is 231871238712");
	}

	public static void main(String[] args) 

	{
		Student s = new Student();
		s.CollegeCode();
		s.CollegeName();
		s.CollegeRank();
		s.DepatName();
		s.StudentName();
		s.StudentDept();
		s.StudentID();

	}

}
