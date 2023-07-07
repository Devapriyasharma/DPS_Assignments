package week3.day2;

public class ConvertStringtoInt {

	public static void main(String[] args) {
		//convert string to int
				String str="6,299";
				//step1 replace , with empty string
				String replace = str.replace(",", "");
				//using Integer.parseInt method to convert string into integer
				int convertedString = Integer.parseInt(replace);
				System.out.println(convertedString);
			

	}

}
