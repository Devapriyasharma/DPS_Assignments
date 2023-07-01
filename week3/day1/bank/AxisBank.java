package bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Changed Deposit Amount: 14,000");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.saving();
		obj.fixed();
	}
	
	
}
//Assignment3
//============
//  Class     :BankInfo
//  Methods :saving(),fixed(),deposit()
//
//   Class     :AxisBank
//   Methods :deposit()
//
//Description:
//You have to override the method deposit in AxisBank.