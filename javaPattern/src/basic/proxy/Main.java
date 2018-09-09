package basic.proxy;

/**
 * 
 * proxy - 대리인
 * 
 * 본인이 필요하게되는 특정상황(PrintProxy 클래스가 print메소드를 실행하는 상황)이 오기 전까지
 * 대리인(PrintProxy 클래스)은 대리인의 역할을 계속 수행한다.
 * 
 * PrintProxy class의 setPrinterName과 getPrinterName을 여러차례 호출해도 Printer의 인스턴스는 생성되지 않습니다.
 * 
 * 꼭 기억해야할 점: Printer class는 PrinterProxy의 존재를 모른다는 점.
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		Printable p = new PrinterProxy("Alice");
		System.out.println("current name is " + p.getPrinterName() + ".");
		p.setPrinterName("Bob");
		System.out.println("current name is " + p.getPrinterName() + ".");
		p.print("Hello, world.");
	}

}
