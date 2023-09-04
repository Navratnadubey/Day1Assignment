/*
 5. Input 3 numbers and find the largest.

Input: 7
3
5
Output: 7
Condition : your program cannot have more than 2 comparisons
 */
package day1Assignment;
import java.util.Scanner;
public class pgNo_05 {
       public static void main(String args[]) {
    	   Scanner input=new Scanner(System.in);
    	   int x=input.nextInt();
    	   int y=input.nextInt();
    	   int z=input.nextInt();
    	   int a=x>y?x:y;
    	   int b=a>z?a:z;
    	   System.out.println(b);
       }
}
