package kopattern.factory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Milk extends Product {
	private String name;
	private int price;
	private String expirationDate;
	
	public Milk(String name, int price) {
		this.name = name;
		this.price = price;
		this.expirationDate = setExpirationDate();
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	public String setExpirationDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		cal.add(Calendar.DATE, 4);
		
		return sdf.format(cal.getTime());
	}
	
	public String getExpirationDate() {
		return this.expirationDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", 유통기한: " + getExpirationDate();
	}
}
