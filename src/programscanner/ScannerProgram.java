package programscanner;

import java.util.Scanner;

public class ScannerProgram {
	
Scanner sc=new Scanner(System.in);
  

/*public void add() {
	System.out.println("Enter the int value");
	int a=sc.nextInt();
	System.out.println("enter the float value");
	float b=sc.nextFloat();
	float c=a+b;
	System.out.println("Add the two datatype value is" +c);
	
}*/

public void moni()
{
	//System.out.println("enter the string value");
	//String s1=sc.next();
	//System.out.println(s1);
	System.out.println("enter the stringline value is" );
	String s2=sc.nextLine();
	System.out.println(s2);
	
	
}

/*public void rithu()
{
System.out.println("my boolean value is");
boolean b1=sc.nextBoolean();
System.out.println("the value of boolean is"  +b1);
}*/

public static void main(String[] args) {
	ScannerProgram prog=new ScannerProgram();
	//prog.add();
	prog.moni();
	//prog.rithu();
}



	
}
		
		



