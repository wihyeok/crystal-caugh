package templateMethod;

import java.util.ArrayList;

public class Memb {

	ArrayList<WaetBal> waetList= new ArrayList<WaetBal>();
	
	private String name;
	private String company;
	
	public Memb(String name) {
		super();
		this.name = name;
	}
	
	
	
	public Memb(String name, String company) {
		super();
		this.name = name;
		this.company = company;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public ArrayList<WaetBal> getWaetList() {
		return waetList;
	}
	public void setWaetList(ArrayList<WaetBal> waetList) {
		this.waetList = waetList;
	}
	
	
	
	
	
}
