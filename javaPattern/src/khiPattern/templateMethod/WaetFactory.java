package khiPattern.templateMethod;


public class WaetFactory extends Factory  {

	@Override
	protected WaetBal create(String type) {
		// TODO Auto-generated method stub
		try {
			if(type.equals("CNS")) {
				return new CnsWaet();
			}
			else if(type.equals("SDS")) {
				return new SDSWaet();
			}
			else {
				new Exception();
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("지갑타입에러");
		}
		return null;
	
	}

	
}
