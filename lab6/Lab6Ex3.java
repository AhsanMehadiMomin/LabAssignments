package cap.collection.lab6;

import java.util.HashMap;
import java.util.Iterator;

public class Lab6Ex3 {
	  public static void main(String[] args) {
		  
		    int array[] = {1,2,3,4,5,6,7,8,9,10};
		    HashMap<Integer,Integer> map = getSquares(array);
		 
		    Iterator<Integer> i = map.keySet().iterator();
		    while(i.hasNext()){
		    Integer key = i.next();
		      System.out.println(key + " : " + map.get(key));
		    }
		  }

	

		 
		 public static HashMap<Integer, Integer> getSquares(int[] array) {
		    HashMap<Integer, Integer> map = new HashMap<>();
		 
		    for (int n: array) {
		      map.put( n, n*n);
		    }
		    return map;
		  }
		 
		
		}
