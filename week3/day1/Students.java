package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID: " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID & Name: " + id + ","+ name);
	}
	
	public void getStudentInfo(String email, long phonenumber) {
		System.out.println("Student email & Phone number: " + email + "," + phonenumber);
	}
	
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(123456);
		obj.getStudentInfo(123456, "Devapriya Sharma");
		obj.getStudentInfo("devapriya@gmail.com", 9999912345l);
			
	}
}


//Assignment 4
//==============
//
//      Class: Students
//      Methods: getStudentInfo()
//
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber