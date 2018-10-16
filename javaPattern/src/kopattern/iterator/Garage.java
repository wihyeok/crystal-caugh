package kopattern.iterator;

public class Garage implements Aggregate {
	private Car[] cars;
	private int maxSize = 0;
	private int cursor = 0;
	
	public Garage(int maxSize) {
		this.maxSize = maxSize;
		this.cars = new Car[maxSize];
	}
	
	public Car getCar(int index) {
		return cars[index];
	}
	
	public void appendCar(Car car) {
		if (maxSize <= cursor) {
			System.out.println("차고가 가득 차 더 이상 차를 보관할 수 없습니다.");
			return;
		}
		this.cars[cursor] = car;
		System.out.println(car.getCarId() + "가 정상적으로 차고에 보관되었습니다.");
		cursor++;
	}
	
	public int getLength() {
		return cursor;
	}
	
	public Iterator iterator() {
		return new GarageIterator(this);
	}
}


