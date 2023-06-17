package week1.day1;


public class Mobile {
	

	private void makeCall() {
		
		String mobileModel = "iPhone";
	    float mobileWeight = 280.35f;
		
		System.out.println("Call the number");
		
	}
	private void sendMsg() {
		boolean fullCharged = true;
		int mobileCost = 1000;
		
		System.out.println("Hello");

	}
	
	public static void main(String[] args) {
		Mobile info = new Mobile();
		info.makeCall();
		info.sendMsg();
		System.out.println("This is my mobile");
	}
	

}


