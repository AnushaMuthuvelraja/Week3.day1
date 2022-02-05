package homework3.week3;

public class AxisBank extends bankInfo {

    int depositAmount=30000;	
	  
		
		public void deposit()
		{
			System.out.println("Your deposit amount in AxisBank is"+ depositAmount);
		}
	
       public static void main(String[] args)
       {
		
    	   AxisBank obj=new AxisBank();
    	   obj.deposit();
    	   obj.saving();
    	   obj.fixed();
	}

}





