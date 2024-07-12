package ExceptionHandling;
import java.util.Scanner;

class InvalidUserException extends Exception{
	public String getMessage() {
		return "Invalid Card details.Try again!!";
	}
}

class ATM{
	private int accNum = 123456;
	private int pin = 9999;
	private int an;
	private int pwd;
	
	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		an = sc.nextInt();
		System.out.println("Enter the pin");
		pwd = sc.nextInt();	
		
	}
	public void validate() throws InvalidUserException {
		if(accNum == an && pin == pwd) {
			System.out.println("Minku Collect your money");
		} else {
			  InvalidUserException iue= new InvalidUserException();
			  System.out.println(iue.getMessage());
			  throw iue;
		}
	}
}
class Bank{
	public void initiate() {
		ATM atm = new ATM();
		try {
			atm.acceptInput();
			atm.validate();
		}
		catch(Exception e) {
			try {
				atm.acceptInput();
				atm.validate();
			} 
			catch(Exception f) {
				try {
					atm.acceptInput();
					atm.validate();
				}
				catch(Exception g) {
					System.out.println("Card is Blocked");
				}
			}
		}
	}
}
public class AtmCard {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();
	}

}
