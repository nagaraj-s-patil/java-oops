package PracticeOnSeminar;

public class CarExampleOfEncapsulation {

	int cost;
	
	public void setCost(int cost) {
		
		this.cost=cost;
		
	}
	public int getCost() {
		
		return cost;
	}
	
	public static void main(String[] args) {
		
		CarExampleOfEncapsulation c=new CarExampleOfEncapsulation();
		
		c.setCost(200000000);
		int cost=c.getCost();
		System.out.println("Cost of car is :"+cost);
		
	}
}
