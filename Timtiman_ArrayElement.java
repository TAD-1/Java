import java.lang.System;
import java.lang.String;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayElement{
 public static void main(String[] args){
    
     
    int n = 0;
    int c = 0;
    int [] elements = new int [10];	
    
  	Scanner num = new Scanner (System.in);
 	System.out.println("Enter 10 elements: ");
    
    do {
    	
     	try {
     	 elements[c] = num.nextInt();
     		}

      catch (InputMismatchException e){
     	System.out.println("\n\n\n");
     	System.out.println("Wrong input. Please input a integer.");
     	main(args);
   		    }
     
     c++;
     
    } while (c <= 9);
    	
         
    System.out.print("Enter index number to retrieve: ");
    n = num.nextInt();         
    
    System.out.println("\n\n\n");
    System.out.print("Element at index " + n +" is " + elements[n] + " ");
    System.out.println("\n\n\n");
    System.out.println("End");
    System.exit(0);
    
    }
    
   
 }
     
   
