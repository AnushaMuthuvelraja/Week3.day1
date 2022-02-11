package homework3.week3;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection 
{

	public static void main(String[] args) 
	{
		/* Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a neListsted for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
	Set<Integer>arr1=new HashSet<Integer>();
	
		arr1.add(3);
		arr1.add(2);
		arr1.add(11);
		arr1.add(4);
		arr1.add(6);
		arr1.add(7);
		System.out.println("Elements in arr1" +arr1);
		Set<Integer> arr2=new HashSet<Integer>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(8);
		arr2.add(4);
		arr2.add(9);
		arr2.add(7);
		System.out.println("Elements in arr2"+arr2);
		
		Set<Integer> arr3=new HashSet<Integer>(arr1);
		
		arr3.retainAll(arr2);
		System.out.println("Elements in arr3="+arr3);
	
	}
}
		
		//Intersection using Arrays
		/*int a[]= {2,3,6,7,9,11};
		int b[]= {4,6,8,9,12};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
				
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i]);
			
				}
			
			
				
			}
		}

	}
}*/


