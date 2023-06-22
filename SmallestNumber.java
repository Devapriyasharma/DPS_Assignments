package week1.day2;

import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] nums = { 23, 45, 67, 32, 89, 22 };
		Arrays.sort(nums);
		System.out.println("Second smallest number is " + nums[1]);

	}

}
//Find the Second smallest number in the array {22,45,67,32,89,22 }
//int len = nums.length;