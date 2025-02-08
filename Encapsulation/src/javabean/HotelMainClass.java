package javabean;

public class HotelMainClass {

	public static void main(String[] args) {
		
		Hotel h=new Hotel();
		
		h.setName("Durga hotel");
		h.setRating(4.2);
		
		System.out.println("hotel name: "+h.getName());
		System.out.println("hotel rating: "+h.getRating());
		
	}
}
