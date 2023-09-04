/*
 3. Given the days expressin the formof Years: Months:Weeks:
Days
Test Case:
Input : 1020 days
Output: 2 Years : 9 Months: 2 Weeks : 6 Days
Hint : 365 days make a year, 30 days make a month , 7 days make a week
 */
package day1Assignment;
import java.util.*;
public class pgNo_03 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int year,months,weeks,days;
		year=x/365;
		x=x%365;
		months=x/30;
		x=x%30;
		weeks=x/7;
		x=x%7;
		days=x/1;
		System.out.println(year+" years : "+months+" months : "+weeks+" weeks : "+days+" days ");
	}

}
