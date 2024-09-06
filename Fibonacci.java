package Numbers;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter num:");
        int n=obj.nextInt();
        int n1=0;
        int n2=1;
        System.out.print("Fibonacci Series: "+n1+" "+n2);
        for(int i=2;i<n;i++) {
        	int n3=n1+n2;
        	System.out.print(" "+n3);
        	n1=n2;
        	n2=n3;
        }
	}

}
