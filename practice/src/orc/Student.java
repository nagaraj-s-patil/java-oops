package orc;

public class Student {
	String name="tom";
	int age=79;
	long phno=9606541573l;
	
	Student(String name,int age,long phno){
		this.name=name;
		this.age=age;
		this.phno=phno;
	}
	public static void main(String[] args) {
		Student s1=new Student("Tom", 79,  9019899761l);
		Student s2=new Student("nagu", 23, 9753498573l);
		Student s3=new Student("bhagya", 23, 9753495541l);
		Student s4=new Student("sanket", 33, 9753545473l);
		Student s5=new Student("mallu", 53, 9753455573l);
	
		
				
		Student[] s= {s1,s2,s3,s4,s5};
		
		for(int i=0;i<1;i++) {
			System.out.println("name: "+s[i].name+" age: "+s[i].age+" phno: "+s[i].phno);
		}
	}
}
