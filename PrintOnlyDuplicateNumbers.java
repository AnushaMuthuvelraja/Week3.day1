package homework3.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintOnlyDuplicateNumbers {

	public static void main(String[] args) 
	{
		
		int[] numbers = {14,11,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> firstNumber=new HashSet<Integer>();
       for(int i=0;i<numbers.length;i++)
        {
        	
       if(firstNumber.add(numbers[i])==false)
        	{
        		System.out.println(numbers[i]);
        	}
	}
	}
}
	
	
