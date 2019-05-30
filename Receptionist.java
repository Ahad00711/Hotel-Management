
import java.util.*;

public class Receptionist {

	public String welcomeMessage;
	private String customerName;
	private String customerID;
	private String customerPhone;
	private String customerAddress;

	public Receptionist(String customerName, String customerID, String customerPhone, String customerAddress) {

		this.customerName = customerName;
		this.customerID = customerID;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;

	}

	public Receptionist() {
		super();

		this.customerName = null;
		this.customerID = null;
		this.customerPhone = null;
		this.customerAddress = null;
	}

	// getter setter

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getrecepWelcomeMessage() {
		return welcomeMessage = "\n********************************************************\n*********  Welcome For Booking our Hotel Room  *********\n********************************************************";

	}

	// check ROOM Availability

	public void checkRoomAvailability() {

		// Total Room in Numbers.........

	}

	public void generateBill(double rate) {

		System.out.println("Your Rent Bill = " + rate + " -/Rs.");

	}

	@Override
	public String toString() {
		return "\n****************************\n****  Customer Info ::  ****\n****************************\nName :"
				+ getCustomerName() + "\nID Card Number : " + getCustomerID() + "\nPhone # " + getCustomerPhone()
				+ "\nAddress : " + getCustomerAddress() + ".\n----------------------------\n";
	}

}
