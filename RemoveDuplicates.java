package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count =1;
		String notduplicate = "";
		String [] newtext = text.split(" ");
		for (int j = 0; j < newtext.length; j++) {
			String output = newtext[j];
			for (int k = j+1; k < newtext.length; k++) {
				if (newtext[k].equals(output)) {
					count++;
					newtext[k]="duplicate";
					
					
				}
				if (count ==1) {
					 notduplicate =  notduplicate + output ;
					 System.out.println(notduplicate);
				}
				else {
					System.out.println(output+ " ");
				}
				
			}
			
		}
		
}
			
	}
			
			
//

/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */