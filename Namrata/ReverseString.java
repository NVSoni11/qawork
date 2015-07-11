package comp.bss.testprog1;

public class ReverseString 
{

	public static void main(String[] args) 
	{
	
		String str1 = new String("Namrata Soni Yadav");
		System.out.println("str1 = "+str1);
		char array[] =str1.toCharArray();
		//System.out.println(array);
		//System.out.println(array.length);

		for (int i=array.length-1, j=0 ;i>=array.length/2; i--,j++)
		{
			char swap;
			//System.out.println("i=: " +i);
			//System.out.println("j=: " +j);
				swap = array[j];
				array[j] = array[i];
				array[i] = swap;
				//System.out.println(array[i] + " " + array[j]);
				
		}
		System.out.println(array);
		str1 = new String(array);
		System.out.println(str1);
	}
	
}
