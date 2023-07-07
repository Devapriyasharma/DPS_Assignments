package week3.day2;

public class ChangeOddtoUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] test1 = test.toCharArray();
		
		
		for (int i = 0; i < test1.length; i++) {
			if (i%2==0) {
				System.out.print(test1[i]);
			} else {
				
				System.out.print(Character.toUpperCase(test1[i]));
			}
		}
		

	}

}
/*
Pseudo Code

* Declare String Input as Follow
 
* String test = "changeme";

* a) Convert the String to character array

* b) Traverse through each character (using loop)

* c)find the odd index within the loop (use mod operator)

* d)within the loop, change the character to uppercase, if the index is odd else don't change
 
*/