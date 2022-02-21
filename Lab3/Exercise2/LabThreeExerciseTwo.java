class LabThreeExerciseTwo
	{
	public static String getImage(String str)
		{
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		StringBuilder reverse=sb.reverse();
		return reverse.toString();
		
		}
	public static void main(String []args)
		{
		String str="hello";
		String x=LabThreeExerciseTwo.getImage(str);
		System.out.println(str+"|"+x);
		}
	}
		