package comp.bss.testprog1;

public class Palindrome {
	public static void main(String[] args) 
	{
		Integer numbers[] = {11, 2, 2, 3, 4, 2, 11};
		boolean value = true;
		for(int i = 0,j = numbers.length-1; i < numbers.length/2 ; i++,j--)
		{
			
			if( numbers[i] != numbers[j])
			{
				value = false;
				break;
			}
				
		}
		if (value == true)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");	
	}
}
