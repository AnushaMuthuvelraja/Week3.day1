package homework3.week3;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindSecondLargest 
{

	public static void main(String[] args)
	
	{
		
		/*int data[] = {3,2,11,4,6,7,67,89,99,23,55};
		Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		
		List <Integer>list=new LinkedList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(72);
		list.add(67);
		list.add(97);
		list.add(76);
		list.add(77);
		list.add(75);
		list.add(75);
		Collections.sort(list);
		System.out.println(list);
	    int size = list.size();
	    System.out.println("Size of the List=" +size);
	Integer integer = list.get(size-2);
		System.out.println("Second Largest Number in the list=" +integer);

	   
	}
	
	
	
		
}
