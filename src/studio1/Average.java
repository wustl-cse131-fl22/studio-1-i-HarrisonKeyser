package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What's the first of two integers to be averaged?");
		int num1 = in.nextInt();
		System.out.println("What's the second of two integers to be averaged?");
		int num2 = in.nextInt();
		System.out.print("The average of these two integers is: ");
		System.out.println(((double)(num1 + num2)) / 2);
	}

}
