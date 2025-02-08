package storingObjects;

public class StudentMainClass {
	public static void main(String[] args) {
		
		Student s1=new Student(22,"nagaraj");
		Student s2=new Student(50,"sanket");
		Student s3=new Student(24,"mallu");
		
		Student[] s= {s1,s2,s3};
		
		for(int i=0;i<s.length;i++) {
			System.out.println("Name : "+s[i].name+" age : "+s[i].age);
		}
	}
}
