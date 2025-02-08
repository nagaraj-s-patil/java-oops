package org;
import com.Father;

public class son extends Father {
	public static void main(String[] args) {
		//Accesing protected members in different package
		
		son s=new  son();
		
		System.out.println(s.name);
		System.out.println(s.age);
		
		
	}

}
