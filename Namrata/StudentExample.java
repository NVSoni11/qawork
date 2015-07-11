package comp.bss.testprog1;

import java.util.Scanner;
import java.util.TreeMap;

class Student
{
	public Student(int id, String name, String email, String address)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	int id;
	String name;
	String email;
	String address;
	
}

public class StudentExample 
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	
	TreeMap<Integer,Student> tmap = new TreeMap<Integer,Student>();
	
	int id;
	String name;
	String email;
	String address;
	String str;
	do
	{
		System.out.println("Enter \"I\" to insert and \"G\" to get");
		str = s.next();
		if (str == "I")
			{
				System.out.println("Enter id:");
				id = s.nextInt();
				System.out.println("Enter name:");
				name = s.next();
				System.out.println("Enter email:");
				email = s.next();
				System.out.println("Enter address:");
				address = s.next();
				/*
				System.out.println("ID :" +id);
				System.out.println("name :" +name);
				System.out.println("email :" +email);
				System.out.println("address :" +address);
				*/
				Student sd = new Student(id,name,email,address);
				tmap.put(id, sd);
				System.out.println("Press \"Y\" to enter another");
				str = s.next();
			}
		else if (str == "G")
			{
				System.out.println("Enter id to get");
				id = s.nextInt();
				Student sd = tmap.get(id);
				System.out.println("ID :" +sd.id);
				System.out.println("name :" +sd.name);
				System.out.println("email :" +sd.email);
				System.out.println("address :" +sd.address);
				System.out.println("Press \"Y\" to get another");
				str = s.next();
			}	
	}
	while (str.equals("Y"));
	
	s.close();
}
}
