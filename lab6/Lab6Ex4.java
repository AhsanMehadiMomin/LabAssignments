package cap.collection.lab6;

import java.util.HashMap;
import java.util.Set;

public class Lab6Ex4 
{
	public HashMap<String, String> getStudent(HashMap<String,Integer> student)
    {
           HashMap<String,String> medal = new HashMap<>();
           Set<String> set = student.keySet();
           for(String s:set)
           {
                  Integer marks = student.get(s);
                  if(marks>=90)
                  {
                        medal.put(s,"Gold");
                  }
                  else if(marks >=80)
                  {
                        medal.put(s,"Silver");
                  }
                  else if(marks>=70)
                  {
                        medal.put(s,"Bronze");
                  }
           }
           return medal;
    }
    public static void main(String[] args)
    {
           HashMap<String,Integer> student = new HashMap<>();
           Lab6Ex4 p = new Lab6Ex4();
           
           student.put("RollNo1",70);
           student.put("RollNo2",75);
           student.put("RollNo3",90);
           student.put("RollNo4",80);
           student.put("RollNo5",93);
           System.out.println(p.getStudent(student));
    }

}
