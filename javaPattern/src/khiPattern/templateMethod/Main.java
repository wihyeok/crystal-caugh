package templateMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Memb hyein = new Memb("김혜인","cns");
		
		
	
		WaetBal cnsWaet	= new CnsWaet();	
		cnsWaet.create(10000, "김혜인");
		
		WaetBal sdsWaet	= new SDSWaet();	
		sdsWaet.create(10000, "김혜인");
	 
		hyein.waetList.add(cnsWaet);
		hyein.waetList.add(sdsWaet);
		
		
		
	}

}
