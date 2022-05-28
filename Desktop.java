//$Id$
package week3.day1;

public class Desktop extends Computer {

	public void DesktopSize()
	{
		System.out.println("Desktop size is 50 Inches");
	}

	public static void main(String[] args)

	{
		Desktop d = new Desktop();
		d.computerModel();
		d.DesktopSize();
	}

}
