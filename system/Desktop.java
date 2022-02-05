package org.system;

public class Desktop extends Computer
{

	public void desktopSize()
	{
		
		System.out.println("My Desktop size is 14inch");
		
	}
	
	public static void main(String[] args)
	
	{
	   
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
}
