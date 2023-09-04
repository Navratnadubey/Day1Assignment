/*
7. The military uses a 4-digit number system for communicating the time of day. For
example, 2350 hours ie 23 hours and 50 minutes in 24-hour clock which is 11:50pm.
Write a program to input the 4-digit time and convert it to 12-hour format.
Eg: 2350 >>> 11:50pm
 */
package day1Assignment;
import java.util.Scanner;
public class pgNo_07 {
       public static void main(String args[]) {
    	   Scanner input=new Scanner(System.in);
    	   int x=input.nextInt();
    	   int hour=x/100;
    	   hour=hour%12;
    	   int mins=x%100;
    	   mins =mins%60;
    	   System.out.println(hour+":"+mins);
       }
}
