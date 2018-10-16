package kopattern;

public class Car {
	private String model;
	private String carId;
	
	public Car(String model, String carId) {
		this.model = model;
		this.carId = carId;
	}
	
	public String getCarId() {
		return carId;
	}
	
	public String getCarInfo() {
		String carInfo = "model: " + model + ", carId: " + carId;
		return carInfo;
	}
}
