class LabTwoExercise1
{  
	public static void main(String args[])
		{  
			int a[]={1,2,5,6,3,2};
			int x=getSecondSmallest(a,5);
	  
			System.out.println("Second smallest: "+x);  
	  
		}

		public static int getSecondSmallest(int[] a, int num)
			{  
				int temp;  
				for (int i = 0; i < num; i++)   
					{  
						for (int j = i + 1; j < num; j++)   
							{  
								 if (a[i] > a[j])   
									{  
										  temp = a[i];  
										  a[i] = a[j];  
										  a[j] = temp;  
								    }  
							}  
					}  
					return a[1]; 
			} 

}