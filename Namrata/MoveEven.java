package comp.bss.testprog1;

public class MoveEven 
{
	public static void main(String[] args) 
	{
		double numbers[] = {11, 7, 3, 2, 2,56,100,-2,0, 2.5};
		int oddposition = 0;
		int evenposition = 0;
		double swap;
		int b[] = new int[10];
		while (evenposition < numbers.length)
		{
			if (numbers[evenposition]%2 == 0)
			{
				swap = numbers[evenposition];
				numbers[evenposition] = numbers[oddposition];
				numbers[oddposition] = swap;
				oddposition++;
			}
			evenposition++;
		}
		
		for(int i=0; i<numbers.length;  i++)
		{
			System.out.println(numbers[i]);
		}
		
	}
}

