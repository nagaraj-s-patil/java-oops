package storingObjects;

public class Car {

	double cast;
	
	Car(double cast){
		this.cast=cast;
	}
	
	public static void main(String[] args) {
		
		Car C1=new Car(400000.00);
		Car C2=new Car(500000.00);
		
		
		Car[] c=new Car[2];//Car[] c={c1,c2};
		c[0]=C1;                    //0  1
		c[1]=C2;   
		
		for(int i=0;i<c.length;i++) {
			System.out.println(i);
			System.out.println(c[i]);
			System.out.println(c[i].cast);
		}
		
	} 
}
