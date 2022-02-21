class LabTwoExercise4 
{
	public static void main(String[] args)
	{
		int[] arr ={1,2,3,4,1,2};
		int[] a=modifyArray(arr);
		System.out.println(a);
	}
	public static int[] modifyArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			int currentelement=arr[i];
			int count=0;
			for(int j=i+1; j<arr.length; j++)
			{
				if(currentelement==arr[j])
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(currentelement);
				
			}

			
		}
		return arr;
		 
}
}