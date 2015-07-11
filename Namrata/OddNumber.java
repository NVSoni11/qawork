package comp.bss.testprog1;

public class OddNumber 
{
public static void main(String[] args) 
{
	double numbers[] = {11,7,3, 2, 2,56,100,-2,0, 2.5};
	for(int i=0; i<numbers.length; i++)
	{
		
			if(numbers[i]%2 != 0)
			{
				System.out.println(numbers[i]);
			}
		
	}
	
}
}
