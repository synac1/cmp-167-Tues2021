import java.util.Date;

public class Customer {
	public String name;
	public String address;
	public Date dob;
	public int cardNumber;
	public int pin;
	
	public boolean verifyPassword(String password) {
		return false;
	}
}
