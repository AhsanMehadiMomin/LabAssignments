package cap.collection.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Lab6Ex1 
{

	public static void main(String[] args)
	{
		TreeMap<Integer,String> map = new TreeMap<>();
		
		map.put(10, "classes&objects");
		map.put(40, "Inheritance");
		map.put(60, "Polymorphism");
		map.put(90, "Encapsulation");
		map.put(90, "DataAbstraction");
		
		List<String> list = getValues(map);
		System.out.println(list);
		
	}
	
	static List<String> getValues(TreeMap<Integer,String> map)
	{
		List<String> list = new ArrayList<>(map.values());
		
		Collections.sort(list);
		
		return list;
	}

}
