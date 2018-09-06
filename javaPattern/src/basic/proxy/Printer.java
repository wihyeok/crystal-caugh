package basic.proxy;

public class Printer implements Printable {
	private String name;
	
	public Printer() {
		heavyJob("Printer의 인스턴스를 생성 중");
	}
	
	public Printer(String name) {
		this.name = name;
		heavyJob("Printer의 인스턴스 (" + name + ")을 생성 ");
	}

	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return this.name;
	}

	@Override
	public void print(String string) {
		System.out.println("=== " + this.name + " ===");
		System.out.println(string);
	}
	
	private void heavyJob(String msg) {
		System.out.println(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			System.out.println(".");
		}
		System.out.println("완료.");
	}

}
