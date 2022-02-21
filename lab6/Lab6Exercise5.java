package cap.collection.lab6;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class Lab6Exercise5 
{

	public static void main(String[] args)
	{
		Integer[] arr= {10,20,30,5,40};
		int secsmall=getSecondSmallest(arr);
		
		System.out.println("Second smallest number:"+secsmall);
				

		
	}
	
	public static int getSecondSmallest(Integer[] arr)
	{
		List<Integer> a1=Arrays.asList(arr);
		Collections.sort(a1);
		
		int secsmall = a1.get(1);
		System.out.println("After sorting:");
		return secsmall;
		
	}
	
	
	

}
