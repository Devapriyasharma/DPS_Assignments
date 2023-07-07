package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";
		String rev = "";
		char[] value1 = value.toCharArray();
		for (int i = value1.length-1; i >=0 ; i--) {
			rev = rev + value1[i];
		}
	
		if (rev.equals(value)) {
			System.out.println(value + " is a palindrome word");
		} else {
			System.out.println(value + " is not a palindrome word");
		}

	}

}

//Build a logic to find the given string is palindrome or not

	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */