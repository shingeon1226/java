package day_8_array;

import java.util.Scanner;

public class Arrayindex {

	public static void main(String[] args) {
		int nums[] = new int[5];
		Scanner scan = new Scanner(System.in);
		int i =0;
		while(i<nums.length) {
			
		System.out.print("nums["+i+"]=");
		nums[i]=scan.nextInt();
		i++;
		}
		/*nums[0] =10;
		nums[1] =4;
		nums[2] =6;*/
		System.out.println("--------------");
		for ( i =0; i<nums.length;i++) {
			if(i%2==0)
				continue;
			else
			System.out.println("nums["+i+"]="+nums[i]);
		}
	}

}
