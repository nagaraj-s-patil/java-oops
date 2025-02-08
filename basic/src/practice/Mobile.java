package practice;

public class Mobile {
	String userName;
	String password;
	int otp;
	long phno;

	Mobile(String userName,String password){
		this.userName=userName;
		this.password=password;
	}
	Mobile(String username,long phno,int otp){
		this.userName=username;
		this.otp=otp;
	}
	Mobile(long phno,String password){
		this.phno=phno;
		this.password=password;
	}

	void login(String userName,String password) {
		System.out.println("login by user name,password"+userName+" "+password);
	}
	void login(String username,long phno,int otp) {
		System.out.println("login by username,phno ,password"+userName+" "+password);
	}
	void login(long phno,String userName) {
		System.out.println("login by username,phno,password"+phno+" "+userName);
	}



	public static void main(String[] args) {
		
	

		Mobile m1=new Mobile("Nagaraj","nagaraj@123");
		Mobile m2=new Mobile("nagaraj",9901571278l,455662);
		Mobile m3=new Mobile(9606541578l,"nagaraj");

		m1.login("Nagaraj","nagaraj@123");
		m2.login("nagaraj",9901571278l,455662);
		m3.login(9606541578l,"nagaraj");
	}
}
