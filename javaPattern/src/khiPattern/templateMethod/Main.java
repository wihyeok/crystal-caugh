package khiPattern.templateMethod;

/**
 * 
 * !템플릿 메서드 패턴은 전체적으로는 동일하지만 부분적으로는 다른 구문으로 구성된 메서드의 코드 중복을 최소화할 때 유용합니다.
 * 따라서 바뀌는 것과 바뀌지 않는 것을 분리하는 것이 중요합니다.
 *
 */

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
