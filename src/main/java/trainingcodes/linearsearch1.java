package trainingcodes;

import java.util.Scanner;

public class linearsearch1 {
public static void linearSearch(int arr[],int key) {
	for(int i=0;i<arr.length;i++) {
	if(arr[i]==key){
		return(i+1);
	}
	}
	return 0;
}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array element to be searched:");
	int key=sc.nextInt();
	int arr[]= {10,33,53,25,64,45,96,46,38,74};
			
	}

	}

}
