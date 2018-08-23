package khiPattern.templateMethod;


/*
templateMethod 따라해보고 여기에 계속 붙여서 다른패턴도 적용해볼려구요!!! 

그런데 withdraw랑 deposit에 
코드가 중복대자나요...저건 따로 안빼는게 맞는가....ㅠㅠㅠ
 ---> 패턴에서 가장 중요한 것 중 하나는 변하는 것과 변하지 말아야할 것의 분리입니다.
      잘 보면 두 가지가 똑같은 일을 수행하고있다는 것을 확인할 수 있습니다.
      다른 점은 CNS와 SDS라는 각각 다른 벤더사들이 운영하고있는 지갑의 표현이겠지요?
      ** 가급적 메소드에 주석과 논리적인 설명을 달아준다면 그리고 그게 습관이 된다면 좋을 것 같습니다.
      다시 돌아와서 말씀하신 두개의 메소드에서 변경되는(변경가능) 것과 변경되지 않는 것을 분리해내서 다시 구현해보세요.
      글고 Memb클래스는 단순히 사용자만 추가되는 것이 아닌 제가 책에서 실습한 것처럼 Memb클래스를 factory패턴으로 바꿔보십시오.
      이 부분은 내일 이야기해요.
      굳밤~
      

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
