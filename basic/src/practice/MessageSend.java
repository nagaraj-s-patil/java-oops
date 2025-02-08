package practice;

public class MessageSend {
	String email;
	long phno;
	String password;
	
	MessageSend(String email,long phno,String password){
		this.email=email;
		this.phno=phno;
	}
	MessageSend(long phno,String password){
		this.phno=phno;
		this.password=password;
	}
	MessageSend(String email,String password){
		this.email=email;
		this.password=password;
	}

	void notification(String email,String message) {

		System.out.println("message send in email");
	}
	void notification(long phno,String message) {
		System.out.println("message send in pnno");
	}

	void notification(String userName,String password,String message) {
		System.out.println("message send in app");
	}

	public static void main(String[] args) {

		MessageSend m1=new MessageSend("nagaraj",9606541573l,"nagarj");
		MessageSend m2=new MessageSend(9606541573l,"hi bro");
		MessageSend m3=new MessageSend("nagaraj","hi bro");
		
		

		m1.notification("nagarajspatil@66gmail.com", "hii bro");
		m2.notification(9606541573l, "hii bro");
		m3.notification("nagaraj@123", "nagaraj@123");

	}
}
