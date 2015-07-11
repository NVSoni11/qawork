package comp.bss.testprog1;

public class Fibonacci {
	public static void main(String[] args) {
		Integer numbers[] = { 1, 8 , 9, 7, 7, 9, 0, 3};
		boolean value = true;
		for(int i = 0; i < numbers.length-2 ; i++)
		{
			if( numbers[i] + numbers[i+1] != numbers[i+2])
			{
				value = false;
				break;
			}
				
		}
		if (value == true)
		{
			System.out.println("Fibonacci");
		}
		else
			System.out.println("Not Fibonacci");
		
	}

}
