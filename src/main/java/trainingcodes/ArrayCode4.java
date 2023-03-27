

package trainingcodes;

import java.util.Scanner;

public class ArrayCode4 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter the count of movie houses:");
		Scanner sc = new Scanner(System.in);
		int mov_hou=sc.nextInt();
		System.out.println("enter the count of theaters in each movie house:");
		int theater=sc.nextInt();
		System.out.println("enter the count of screen in each theater:");
		int screen=sc.nextInt();
		int arr[][][]=new int[mov_hou][theater][screen];
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the movie house no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the theater no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
	        System.out.println("enter the capacity of the screen no:"+(k+1));
	        arr[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the movie house no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the theater no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
	        System.out.println("the funds collected from the screen no:"+(k+1));
	        int fund=arr[i][j][k]*350;
	        System.out.println(fund);
				
				}
			}
		}
	


	}

}
