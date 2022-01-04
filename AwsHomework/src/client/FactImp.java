package client;

import java.util.Scanner;

import service.FactorialNum;

public class FactImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a number for find factorial");
   int num =input.nextInt();
   int result= FactorialNum.factorial(num);
   System.out.println("Factorial is"+ result);
	}

}
