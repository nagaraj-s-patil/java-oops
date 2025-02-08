package ctp;

public class Netflix {

	static void login(String email , int password) {
		
		System.out.println("Logged in using emaill & password");
	}
	
	static void login(int contactNO ,int otp) {
		System.out.println("Logged in using contact no & otp");
	}
	
	public static void main(String[] args) {
		
		login("tom@gmainl.com", 1234);
		
	 System.out.println("-----------------");
	 Netflix.login(96065415, 47032);
	}
}
