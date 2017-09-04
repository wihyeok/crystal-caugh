package basic.visitor;

/**
 * Directory 클래스가 가지고있는 accept 메소드를 보라.
 * Visitor 클래스를 상속받아 구현된 VisitorList를 argument로 받아서
 * VisitorList 내부에 구현된 Visitor 클래스의 visit메소드를 실행하고있다.
 * 그런데 심지어 자기자신(this)를 넘겨주어 new ListVisitor()를 argument로 넘겨도 된다.
 * 또한 visit(Directory) 메소드는 내부적으로 다시 Entry 클래스를 상속받은 Directory 클래스의 accept를 호출하고있다.
 * 그런데 this가 argument로 넘어가고 있다.
 * 이 얼마나 아름다운 재귀시스템이란말인가...
 * 
 * File 클래스나 Directory 클래스의 accept 메소드 내부에서 호출하고있는 Visitor.visit(this)는 둘 중
 * 어느 클래스에서 사용하건 간에 Visitor 클래스를 상속받아 구현하고 있는 클래스에서 알아서 처리해준다.
 * 
 * 
 * @author hyeok
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			rootdir.accept(new ListVisitor());
			
			System.out.println(" ");;
			System.out.println("Making user entries...");
			Directory Kim = new Directory("Kim");
			Directory Lee = new Directory("Lee");
			Directory Park = new Directory("Park");
			usrdir.add(Kim);
			usrdir.add(Lee);
			usrdir.add(Park);
			Kim.add(new File("diary.html", 100));
			Kim.add(new File("Composite.java", 200));
			Lee.add(new File("memo.tex", 300));
			Park.add(new File("game.doc", 400));
			Park.add(new File("junk.mail", 500));
			rootdir.accept(new ListVisitor());
			
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}

}
