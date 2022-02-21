package cap.collection.lab6;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2
{
	public static void main(String[] args)
	{
		   char[] arr = {'a','b','c','a'};

		   Map<Character, Integer> map = countChars(arr);
		  
		  System.out.println(map);
		
	}
	static Map<Character, Integer> countChars(char[] arr)
	{
		Map<Character,Integer> map = new HashMap<>();
		 for(int i=0;i<arr.length;i++)
		  {
		      if(map.containsKey(arr[i]))
		      {
		    	  Integer a = map.get(arr[i]);
		    	  map.put(arr[i], ++a);
		     
		      }
		      else
		      {
		    	  map.put(arr[i], 1);
		      }
		  }
		 return map;

}
}
