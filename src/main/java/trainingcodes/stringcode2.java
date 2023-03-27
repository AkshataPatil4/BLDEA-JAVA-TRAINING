
package trainingcodes;

import java.util.Scanner;

public class stringcode2 {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String-1:");
		String str1 = sc.next();
		System.out.println("Enter the String-2:");
		String str2= sc.next();
		if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
