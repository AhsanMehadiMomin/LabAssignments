class LabOneExercise6 
{
	public static void main(String[] args) 
	{
		int a =calculateDifference(5);
		System.out.println("a:"+a);
	}

	public static int calculateDifference(int a)
	{
		int sumOfSquare=0;
		int sum=0;

		for(int i=1; i<=5; i++)
		{
			sumOfSquare = sumOfSquare + (int)Math.pow(i,2);
			sum+=i;

		}
		return sumOfSquare - (int)Math.pow(sum,2);
	}

}
