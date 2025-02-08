package PracticeOnSeminar;

public class Father {

	void bike() {
		System.out.println("old bike");
	}
}

class Son extends Father {

	@Override
	void bike() {
		System.out.println("new bike");
	}
}
