import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class Timtiman_PropositionalCalculator{

 public static void main (String args []){
  
  char p, q;
  char logical_operator;
  
 Scanner tvalue = new Scanner(System.in);
 
 	System.out.println("Please only enter T or F.");
 	System.out.println("");
 		
 	System.out.print("Enter the truth value of p: ");
 
 	   p = tvalue.next().charAt(0);
 	   
 	  while ( p != 'T' && p != 'F'){
 	  System.out.println("You can only enter T or F as input.");
 	  System.out.println("");
 	  System.out.print("Enter truth value of p: ");
 	  p = tvalue.next().charAt(0);
 	  }
 	   
 	    
 	System.out.print("Enter the truth value of q: ");
 	
 	  q = tvalue.next().charAt(0);
 	  while ( q != 'T' && q != 'F'){
 	  System.out.println("You can only enter T or F as input.");
 	  System.out.println("");
 	  System.out.print("Enter truth value of q: ");
 	  q =  tvalue.next().charAt(0);
 	  }
 
 	System.out.println("");
 	System.out.println("Choose a logical operator:");
 	
 	System.out.println("[A] And/Conjunction");
 	System.out.println("[I] Inclusive Or / Disjunction");
 	System.out.println("[E] Exclusive Or");
    System.out.println("[C] Conditional/Implication");	
 	System.out.println("[B] Biconditional");
 	
 	System.out.println("");
 	
 	System.out.print("Enter your choice: ");	
 	
 	logical_operator = tvalue.next().charAt(0);
 	
 	Operator(p,q,logical_operator);

 }
 
//Method call 
 
 	public static void Operator( char p, char q, char logical_operator){

 	
 	switch(logical_operator){
 	
 	// And-Conjunction
	case 'A':
	case 'a':
		  
		
		 	if (p =='T' && q == 'T'){
		  
		 System.out.println( "Output: " + p + " implies " + q + " is equal to T");
		 	}
		 	else 
		 	{
		 	
		 System.out.println("Output: " + p + " implies " + q + " is equal to F");
		 	}
	break;	  
		  
		  	
	//Inclusive Or / Disjunction
    case 'I':
    case 'i':
    
    
    
    	 	if (p == 'F' &&  q == 'F'){
    	 	System.out.println("Output: " + p + " implies " + q + " is equal to F");	
    	 	}
		  else {
		  
		  	System.out.println("Output: " + p + " implies " + q + " is equal to T");
		  }
   	  
	break;
	
	
 	// Exclusive Or
	case 'E':
	case 'e':

     if (p == 'T' && q == 'T'){
     
     	System.out.print("Output: " + p + " implies " + q + " is equal to F");
     }
     else if (p == 'F' && q == 'F'){
     
     	System.out.print("Output: " + p + " implies " + q + " is equal to F");	
     }
     	else
     	
		 System.out.print("Output: " + p + " implies " + q + " is equal to T");
     		
	break;
	
	
	//Conditional/Implication
    case 'C': 
    case 'c':
    
		  if ( p == 'T' && q == 'F')
		  		System.out.print("Output: " + p + " implies " + q + " is equal to F");
		  	
		  else
		 
 	 	 System.out.print("Output: " + p + " implies " + q + " is equal to T");
 	 	 
	break;
	
	//Biconditional
	 case 'B':
	 case 'b':
	        
		 if (p == 'T' && q == 'T'){
		 	System.out.print("Output: " + p + " implies " + q + " is equal to T");
		 	
		 }
		
		 else if (p == 'F' && q == 'F')
		 	{
		    System.out.print("Output: " + p + " implies " + q + " is equal to T");
		    }	
		 	
		 	else
		 		System.out.print("Output: " + p + " implies " + q + " is equal to F");
 	
 	break; 	
 		 
	default: System.out.print('\n' + "Sorry invalid input! Please try again." + '\n');
	} 	
 
 	}
}
    

