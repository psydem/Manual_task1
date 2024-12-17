package poly;

import java.util.Scanner;

public class Casting {
public static void main(String[] args) {
	byte a= 34;
	int b= a;
	System.out.println(b);//wideing
	int c= 90;
	byte d= (byte)c;
	System.out.println(d);//narrowing
	Scanner f= new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int e = f.nextInt();//shortcut key to make return type--ctrl+2,L
	System.out.println("Enter the name: ");
	Scanner r=new Scanner(System.in);
	String t = r.nextLine();
	System.out.println(e);
	System.out.println(t);
}
}
