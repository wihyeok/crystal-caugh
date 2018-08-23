package khiPattern.templateMethod;


/*
templateMethod 따라해보고 여기에 계속 붙여서 다른패턴도 적용해볼려구요!!! 

그런데 withdraw랑 deposit에 
코드가 중복대자나요...저건 따로 안빼는게 맞는가....ㅠㅠㅠ


*/
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
