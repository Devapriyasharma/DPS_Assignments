package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean flag = false;
		int a = 47;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("it is NOT a prime number");
		} else {
			System.out.println("it is a prime number");
		}
	}
}
