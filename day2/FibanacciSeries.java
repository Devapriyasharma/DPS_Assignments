package week1.day2;

public class FibanacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range =8;
		int firstnum = 0;
		int secnum = 1;
		System.out.println(firstnum);
		System.out.println(secnum);
		for (int i = 1; i < range-1; i++) {
			int sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
			System.out.println(sum);
			
		}
	}

}
//input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13