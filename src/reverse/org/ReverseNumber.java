package reverse.org;

import java.math.BigInteger;
import java.util.Scanner;

public class ReverseNumber {
	public void ArrayReverse() {
		int[] a= {1,2,3,4,5,6};
		int b= (a.length)-1;
		System.out.print("Original Array values ");
		for (int i=0;i<=b;i++) {
			System.out.print(a[i]);
		}
		System.out.println("\n");
		System.out.print("Reverse Array values ");
		while(b>=0) {
			System.out.print(a[b]);
			b--;
		}
		}
	public void StringReverse()
	{
		System.out.println("\n");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String values ");
		String a = sc.nextLine();
		System.out.println("Original String values "+a);
		System.out.println("\n");
		char[] rev = a.toCharArray();
		String rever="";
		int b = (a.length())-1;
		for(int i=b;i>=0;i--) {
			rever+=rev[i];
		}
		System.out.println("Reverse String values "+rever);
		System.out.println("\n");
		if(a.equals(rever)) {
			System.out.println("Its a palindrom");
		}
		else {
		System.out.println("Its not a palindrom ");
		sc.close();
		}
		
	}
	private void NumberRiverse() {
		System.out.println("Enter number: ");
		Scanner scan= new Scanner(System.in);
		int input = scan.nextInt();
		//int input = 123;
		int r,temp,sum=0;
		temp=input;
		System.out.println("origingal value "+temp);
		while(input>0) {
			r=input%10;
			sum= (sum*10)+r;
			input=input/10;	
		}
		System.out.println("Reveresed value "+sum);
		if(temp==sum) {
			System.out.println("its a palindrom");
		}
		else{
			System.out.println("Its not a palindrom");
		}
	scan.close();
	}
	public static void main(String[] args) {
		ReverseNumber rn= new ReverseNumber();
		rn.ArrayReverse();
		rn.StringReverse();
		rn.NumberRiverse();
	}

}
