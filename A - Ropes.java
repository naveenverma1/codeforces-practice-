Q. There are n ropes, you need to cut k pieces of the same length from them. Find the maximum length of 
pieces you can get.

import java.io.*;
import java.util.*;

public class Main
{
    public static int check(int[] a, double x, int k) {   //Function to check whether mid is valid answer or not
	    int p = 0;
	    for(int i = 0 ; i <a.length ; i++) {
	        p += a[i] / x;   //Here we count number of possible ropes of size x which can be made
	    }
	    if(p >= k) {         //If this value is greater than k then we return 1 else 0
	        return 1;
	    }
	    else{
	        return 0;
	    }
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();    //Getting n as input
		int k = sc.nextInt();    //Getting k as input
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		double l = 0;     //Initializing l=0 as left most possible double answer
		double r = 100000000;   //Initializing r=10^8 as left most possible double answer
		for(int i = 0 ; i < 60 ; i++) {    //Iterating for loop for 60 iterations as Logbase 2 (10^18) = 60
		    double mid = (r - l) / 2 + l;  //Calculating mid value
		    if(check(a, mid, k) == 1) {    //Checking if it's valid input or not
		        l = mid;                   //If true, then we update l=mid
		    }
		    else{
		        r = mid;                   //If false, the we update r=mid
		    }
		}
		System.out.println(String.format("%.6f", l));   //Printing our answer till 6 decimal places after .
	}
    
}
