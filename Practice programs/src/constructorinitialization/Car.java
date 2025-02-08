package constructorinitialization;

public class Car {
	String brand;
	double cost;

	Car(String brand,double cost){
		this.brand=brand;
		this.cost=cost;
	}
	
	public static void main(String[] arg) {
		Car c=new Car("TATA",4800000);
		System.out.println("brand :"+c.brand+" cost :"+c.cost);
		System.out.println("---------------------------------");
		Car c1=new Car("Maruti800",6000000);
		System.out.println("brand :"+c1.brand+" cost :"+c1.cost);
	
	}
}
