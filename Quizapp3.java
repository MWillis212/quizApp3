
import java.util.Scanner;

public class Quizapp3 {
 public static void main(String[] args) {
   
	  boolean y = true, n = false;  
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a grade  :");
    int grade1 = scan.nextInt();
     System.out.println(grade1);
   
     Scanner scan1 = new Scanner(System.in);
     System.out.println("Would you like to enter more grades : [y/n]");
    
    String response = scan1.nextLine();
    
     if( response.charAt(0) == 'y') {  System.out.println("Enter a grade  :");
    int grade2 = scan.nextInt();
     System.out.println(grade2);
     System.out.println("Would you like to enter more grades : [y/n]");
     
     } 
    	
   
    
    	
  }
 }
       
// If no, system would print x students grades>= 90
// then, system println  X students grades =<90 while >=80
// then , system println X Students grades >=70 while 79
// then,  system println xstudents  <=69
   