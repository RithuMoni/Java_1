package programscanner;

import java.util.Scanner;

public class MyCharacter {
	
	Scanner sc=new Scanner(System.in);
	public void charType(char a)
	{
	System.out.println("Enter the character value");
	char b=sc.next().charAt(a);
	System.out.println("the given char is  "  +b);
			
	
	}
	public static void main(String[] args) {
		MyCharacter mc=new MyCharacter();
		mc.charType((char) 0);
		
	}

}
