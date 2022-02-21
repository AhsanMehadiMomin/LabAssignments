class LabOneExercise7 
{
	public static void main(String[] args) 
	{
		boolean b=checkNumber(54321);

		System.out.println("b:"+b);
	}

	public static boolean checkNumber(int num)
	{
		while(num>0)
		{
			int d1=num%10;
			num=num/10;

			if(d1<num%10)
				return false;


		}
		return true;

	}
}
