package kopattern;

public class GarageIterator implements Iterator {
	private Garage garage; 
	private int index;
	
	public GarageIterator(Garage garage) {
		this.garage = garage;
		this.index = 0;
	}
	
	public boolean hasNext() {
		if (index < garage.getLength()) {
			return true;
		} else {
			return false;
		}
	}
	
	public Object next() {
		Car car = garage.getCar(index);
		index++;
		return car;
	}
}
