package comp.bss.testprog1;

public class Occurance 
{
	public static void main(String[] args) 
	{
		double numbers[] = {11, 2, 2, 3, 3, 3, 56, 100, -2, 0, 3,2.5};
			
		for(int i=0; i<numbers.length; i++)
		{
			int count = 0;
			
			for(int j=0; j<numbers.length; j++)
				{
					if(j<i)
					{
						if (numbers[i] == numbers[j])
						{
							count = 0;
							break;
						}
					}
					
					else if(numbers[i] == numbers[j])
					{
						 count++;
					}
					
				}
			if(count != 0)
			System.out.println(numbers[i] +" occurred "+ count + " times");		
		}					
	}
}
