/*2. Swap Both Halfs ,4 Digit
Input a 4-digit number. Interchange the first half with the second half.
Input: 4523
Output : 2345*/

package day1Assignment;
import java.util.Scanner;
public class pgNo_02 {
	public static void main(String []args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=x%100;
		int z=x/100;
		int rev=y*100+z;
		System.out.println(rev);
	}

}
