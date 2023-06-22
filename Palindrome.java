package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 343434343;
		int a = num;
		int temp = 0;
		int remainder;
		for ( ;a != 0;) {
			remainder = a % 10;
			temp = temp * 10 + remainder;
			a = a / 10;
		}

		if (num == temp) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}
	}

}

//Assignment:2
//
//Check the given number is palindrome or not 
//
//Int num =34343
//
//Initialize a  temporary variable.
//
//Reverse the number (using for loop and add to the temporary variable)
//
//Compare the temporary number with reversed number
//
//If both numbers are same, print "palindrome number"
//
//Else print "not palindrome number"
