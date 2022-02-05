package homework3.week3;


public class Automation implements Language,TestTool
{

	public void Java()
	  {
		  System.out.println("Java is "+  MultipleLanguage.language);
	  }
	  
	  public void Selenium()
	  {
		  
	  
		  System.out.println("Test Automation");
	  }

	public static void main(String[] args) 
	{
		
		
		Automation a=new Automation();
		a.Java();
		a.Selenium();
		
		MultipleLanguage m=new MultipleLanguage();
		m.python();
		m.ruby(3.1f);
	}

	 
}
