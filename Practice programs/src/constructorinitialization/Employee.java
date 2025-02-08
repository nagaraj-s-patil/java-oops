package constructorinitialization;

public class Employee {

	int id;
	String name;
	double salary;

	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary; 
	}

	public static void main(String[] args) {

		Employee E1=new Employee(1001,"sanket",200000);
		Employee E2=new Employee(1002,"nagaraj",5000000);

		System.out.println("id: "+E1.id+" name: "+E1.name+" salary "+E1.salary);
		System.out.println("id: "+E2.id+" name: "+E2.name+" salary "+E2.salary);

	}
}
