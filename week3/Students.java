package homework3.week3;

public class Students 
{
    int id;
    String name;
    float phoneNumber;
    String email;
    
    public void getStudentInfo(int id)
	{
		this.id=id;
    	System.out.println("Student id=" +id);
		
		
	}
    
	public void getStudentInfo(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("Student id=" +id );
		
		
	}
	
		
	public void getStudentInfo(String email,float phoneNumber)
	{
		this.email=email;
		this.phoneNumber= phoneNumber;
		System.out.println("Student email=" + email );
		System.out.println("Student phoneNumber=" +phoneNumber );
		
	}
	
	public static void main(String[] args)
	{
		
		Students obj=new Students();
		obj.getStudentInfo(28);
		obj.getStudentInfo(20, "Anusha");
		obj.getStudentInfo("Anusha@gmail.com", 9034897656f);
	}
	
	
}
