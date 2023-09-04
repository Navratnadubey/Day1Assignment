/*
4. Bluebird bus service operates abusonly when its entire 50seats are occupied. X
numberof bookings have beenmade fortheday. Find thenumber of people fromXwho
will gettotravel today.
Case 1:
Input : X= 109
Output:PeopleTravelling=100
Case 2:
Input :X = 49
Output : People Travelling = 0
Hint : No.of passengers travelling = 50 * (x//50)
*/
package day1Assignment;
import java.util.Scanner;
public class pgNo_04 {
      public static void main(String args[]) {
    	  Scanner input=new Scanner(System.in);
    	  int x=input.nextInt();
    	  int p=x/50;
    	  System.out.println("People Travelling = "+p*50);
      }
}
