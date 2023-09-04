/*
 8. Input the name and numbers of units consumed by the consumer. Calculate
the electricity bill.
For the first 100 units charge Rs. 4 per units
For the next 200 units charge Rs. 5 for every additional unit Above 300 units
charge Rs 10 for every additional unit
If the amount exceeds Rs. 1000 charge 5 % additional surcharge All the
amounts are charged 18% GST.
Print the name , unit consumed and the amount to be paid.
Example:
Input: Name : Arjun
Units : 310
Output : Name : Arjun
Units : 310
Amount : 1858.5

Note : 400 (First 100 units) + 1000 (Next 200 units) + 100 ( 10 units) + 75 (5%
surcharge) + 283.5 (GST)= 1858.5 (Total)
 */
package day1Assignment;
import java.util.Scanner;
public class pgNo_08 {
       public static void main(String args[]) {
    	   Scanner input=new Scanner(System.in);
    	   String name=input.next();
    	   int units=input.nextInt();
    	   double ammount;
    	   if(units<=100) {
    		   ammount=units*4;
    	   }else if(units>=100 && units <=300) {
    		   ammount=400+((units-100)*5);
    	   }else {
    		   ammount=400+1000+((units-300)*10);
    	   }
    	   System.out.println("Name : "+name);
    	   System.out.println("units : "+units);
    	   if(ammount<1000) {
    		   System.out.println("Amount : "+ammount);
    	   }else {
    		   ammount=ammount+(ammount*5/100);
    		   ammount=ammount+((ammount*18)/100);
    		   System.out.println("Ammount :"+(ammount));
    	   }
       }
}
