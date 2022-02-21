class LabOneExercise5 
{
	public static void main(String[] args) 
	{
		int a=calculateSum(20);

		System.out.println("a:"+a);
	}

	public static int calculateSum(int a)
	{
		int sum=0;
		for(int i=1; i<=20; i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
}
}