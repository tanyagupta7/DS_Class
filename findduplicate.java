package data;
import java.util.*;

public class findduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner (System.in);

	         System.out.println("Enter the number of elemments");
	         int n = scan.nextInt();
	         System.out.println("Enter the array elemments");
	         int a[]= new int[n];
	         for(int i=0;i<n;i++)
	         {
	             a[i]= scan.nextInt();      
	         }

	         for(int i=0;i<n;i++)
	         {
	             if(a[Math.abs(a[i])]>=0){
	                a[Math.abs(a[i])]= - a[Math.abs(a[i])];
	             }
	             else{
	                 System.out.println(Math.abs(a[i]) + " ");
	             }
	         }
	}

}
