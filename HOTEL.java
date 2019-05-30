
public class HOTEL 
{
    
	public Restaurant restaurant;
	public ROOM room;
	public Receptionist Hotelreception;
	public String feedback;
	
	
	
	public String getFeedback() {
		return feedback;
	}




	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}




	public Restaurant getRestaurant() {
		return restaurant;
	}




	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}




	public ROOM getRoom() {
		return room;
	}




	public void setRoom(ROOM room) {
		this.room = room;
	}




	public Receptionist getHotelreception() {
		return Hotelreception;
	}




	public void setHotelreception(Receptionist hotelreception) {
		Hotelreception = hotelreception;
	}




	public void hotelwelcome() 
	{
		System.out.println("\n**************************************");
		System.out.println("*    <<  Welcome to the HOTEL  >>    *");
		System.out.println("**************************************");
		System.out.println("--------------------------------------");
	}
		
	
	
}
