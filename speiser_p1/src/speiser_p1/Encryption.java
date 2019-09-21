package speiser_p1;
import java.util.Scanner;
public class Encryption {
	public static void main (String args [] ) { 
	
	int digit1, digit2, digit3, digit4, encryptedNumber,userNumber;
	
	Scanner myObj = new Scanner (System.in);
	
	System.out.println("Please Enter a Four-Digit Number: ");
	 
     userNumber= myObj.nextInt();
     
     digit1 = (userNumber / 1000 + 7) %10;
     digit2= (userNumber %1000 /100 + 7) %10;
     digit3= (userNumber %100 /10 +7 ) %10;
     digit4= (userNumber %10 + 7) %10;
     
     encryptedNumber= (digit1 * 10) + digit2 + (digit3 * 1000) + (digit4 * 100);
     
    System.out.print("Your Encrypted Number is " + encryptedNumber);
     
     }
   }
	
