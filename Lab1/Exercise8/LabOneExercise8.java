class LabOneExercise8 
{
	public static void main(String[] args) 
	{
		boolean b=checkNumber(20);
		System.out.println("b:"+b);
	}

	static boolean checkNumber(int num)
	{
		if(num%2==0)
		{
			num/2;
			System.out.println(num);
			return true;
		}
		else
		{
			return false;
		}
	}
}
