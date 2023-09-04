/*Convert MillSec To Hrs,Mins,Secs
Given the time in milliseconds express in the form of Hours: Minute: Seconds
Sample:
Input: 7000234
Output: 1: 56: 40
Hint: 1000 milliseconds make 1 second
60 Seconds makes 1 minute
60 minutes make 1 hour*/

package day1Assignment;
import java.util.Scanner;
public class pgno_01 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int hrs,mins,secs;
		hrs=(x/(1000*60*60))%24;
		mins=(x/(1000*60))%60;
		secs=(x/1000)%60;
		System.out.println(hrs +" : "+ mins +" : "+ secs);	}

}
