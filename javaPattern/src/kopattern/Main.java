package kopattern;

public class Main {
	public static void main(String[] args) {
		Garage garage = new Garage(5);
		
		garage.appendCar(new Car("BMW", "BMW-001"));
		garage.appendCar(new Car("BMW", "BMW-002"));
		garage.appendCar(new Car("Audi", "Audi-001"));
		garage.appendCar(new Car("K5", "K5-001"));
		garage.appendCar(new Car("K5", "K5-002"));
		garage.appendCar(new Car("Ferrari", "Ferrari-001"));
		
		Iterator iterator = garage.iterator();
		
		while(iterator.hasNext()) {
			Car car = (Car)iterator.next();
			System.out.println(car.getCarInfo());
		}
	}
}
