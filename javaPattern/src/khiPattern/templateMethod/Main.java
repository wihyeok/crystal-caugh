package khiPattern.templateMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Memb hyein = new Memb("김혜인","cns");
		
		
		Factory waetFactory = new WaetFactory();
		
		WaetBal cnsWaetFromAbFactory = waetFactory.create("CNS");
		WaetBal sdsWaetFromAbFactory = waetFactory.create("SDS");
		
		
		cnsWaetFromAbFactory.create(10000, "김혜인");
		sdsWaetFromAbFactory.create(10000, "김혜인");
	 
		hyein.waetList.add(cnsWaetFromAbFactory);
		hyein.waetList.add(sdsWaetFromAbFactory);
		
		
		
	}

}
