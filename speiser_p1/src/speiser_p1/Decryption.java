package speiser_p1;
import java.util.Scanner;
public class Decryption {
	public static void main (String args [] ) { 
		
		int digit1, digit2, digit3, digit4, decryptedNumber,userNumber;
		
		Scanner myObj = new Scanner (System.in);
		
		System.out.println("Please Enter an Encrypted Four-Digit Number: ");
		 
	     userNumber= myObj.nextInt();
	     
	     digit1 = (userNumber / 1000 + 3) %10;
	     digit2= (userNumber %1000 /100 + 3) %10;
	     digit3= (userNumber %100 /10 +3 ) %10;
	     digit4= (userNumber %10 + 3) %10;
	     
	     decryptedNumber= (digit1 * 10) + digit2 + (digit3 * 1000) + (digit4 * 100);
	     
	    System.out.print("Your Decrypted Number is " + decryptedNumber);
	   
	    }
	 }
