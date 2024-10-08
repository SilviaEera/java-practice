package dsa;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		Integer n = sc.nextInt();
		int sum = 0;
		
//		Time complexity O(1) or Constant Time Complexity
		
		System.out.println("Sum of natuarl numbers till " + n + " is\t" +((n*(n+1))/2));
		
//		Time complexity O(n)
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
	
		System.out.println(sum);
	}

}
