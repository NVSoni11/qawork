package comp.bss.testprog1;

public class Sort 
{
	public static void main(String[] args) 
	{
		double numbers[] = {11, 2, 2,56,100,-2,0, 2.5};
		Double swap;
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i; j<numbers.length; j++)
			{
				if(numbers[i] > numbers[j])
				{
					swap = numbers[i];
					numbers[i] = numbers[j];
					numbers[j]= swap;
				}
			}
		}
		System.out.println(numbers);
		System.out.println(numbers.toString());
		for(int i=0; i<numbers.length;  i++)
		{
			System.out.println(numbers[i]);
		}
		
	}
}


