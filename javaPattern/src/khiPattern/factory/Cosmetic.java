package khiPattern.factory;

public abstract class Cosmetic {
	String color;
	String name;
	double price;
	public abstract String getType();
	public abstract String getName();
	public abstract String getColor();
	public abstract void info();
}
