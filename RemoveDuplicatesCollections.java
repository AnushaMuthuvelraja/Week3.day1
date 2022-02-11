package homework3.week3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesCollections 
{

	public static void main(String[] args)
	{
		
		String s="We learn java basics as part of java sessions in  java week1";
		String[] split = s.split(" ");
		Set<String> a=new LinkedHashSet<String>();
		for(String d :split)
		{
			a.add(d);
		}
		
		Iterator it=a.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+ " ");
		}
	

	}

}







	/*
	 *  Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	*/
/*String text = "We learn java basics as part of java sessions in java week1";	
		 int count=0;
		 int i;
		 int j;
		 String[] split = text.split(" ");
		
		 for ( i=0;i<split.length;i++)
		 {
			 
			for( j=i+1;j<split.length-1;j++)
	       
			{
			if(split[i].equals(split[j]))
					
			{
				
				//count=count+1;
				//split[j]="0 ";
				
				System.out.println(split[j]);
				
			}
			
			
		 }
	
	}
	


		 for(int k=0;k<split.length;i++)
		{
		     System.out.println(split[i]);
		}*/
	 
		 
	


		 
		 
				
			
	
	

