package homework3.week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInCollections {

	public static void main(String[] args) 
	{
	// Here is the input
	//int[] arr = {1,2,3,4,7,6,8};
    // Sort the array	
	// loop through the array (start i from arr[0] till the length of the array)
    // check if the iterator variable is not equal to the array values respectively
    // print the number
    // once printed break the iteration
	
	int[]arr= {1,2,3,4,7,6,8};
	Set<Integer> s=new TreeSet<Integer>();
	for(int i=0;i<arr.length;i++) 
	{
	    s.add(arr[i]);
	}
	System.out.println("Elements in the given array="+s);
	List<Integer>givenNum=new ArrayList<Integer>(s);
	for(int i=1;i<=givenNum.size();i++) {
	    if(i!=givenNum.get(i-1))
	    {
	        System.out.println(i);
	        break;
	    }
	}
	    }
	}	




	
	
		
	


