package client;

import java.util.Scanner;

import service.ProductOfNumber;
import service.ProductInt;
public class ProductApp {
  public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the first number: ");
	   int num1=sc.nextInt();
	   System.out.print("Enter the second number: ");
	   int num2=sc.nextInt();
	  
	   int result = ProductOfNumber.calcProduct(num1, num2);
	   System.out.println("product of two numbers  "+result);
  }
  
}