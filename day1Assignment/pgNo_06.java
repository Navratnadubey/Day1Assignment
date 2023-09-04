/*
6. 3 Digit Armstrong No.
Input a 3 digit number and find whether the given number is an “Armstrong Number”
(Student)
Definition of an Armstrong Number: Cubic sum of its digit is equal to the number

itself.
153 = 1
3 + 53 + 33
=1 +125 +27=153
Test Data:
Input: 153
Output : 153 is an Armstrong Number
Input: 150
Output: 150 is not an Armstrong
 */
package day1Assignment;
import java.util.Scanner;
public class pgNo_06 {
      public static void main(String args[]) {
    	  Scanner input=new Scanner(System.in);
    	  int x=input.nextInt();
    	  int y;
    	  int fd,sd,ld;
    	  y=x;
    	  fd=y/100;
    	  y=y%100;
    	  sd=y/10;
    	  ld=y%10;
    	  int sum=((fd*fd*fd)+(sd*sd*sd)+(ld*ld*ld));
    	  if(sum==x) {
    		  System.out.println(x+" is an Armstrong Number");
    	  }else {
    		  System.out.println(x+" is not an Armstrong Number");
    	  }
    	  
      }
}
