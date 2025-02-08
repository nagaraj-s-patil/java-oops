package orc;
public class Pen {

	public static void main(String[] args) {
		
		Pen p=new Pen();
		System.out.println(p);
		int hc=p.hashCode();
		System.out.println(hc);
		System.out.printf("%x",hc);
	}
}
