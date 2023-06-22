package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		int num = -240;
		if (num < 0) {
			num  *= -1;
		}
		System.out.println("The Positive number is : " +  num);
	}

}
//Problem statement: 
//Convert a negative number to positive number
//---------Pseudocode: 
//1. Initialize an integer with a negative number like, int number = -40;2. 
//Check if the number is a negative number 
//Hint : any number that is lesser than zero is a negative number3.
//If so, convert the number to a positive number