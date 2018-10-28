package kopattern.templateMethod;

public class TemplateMain {
	public static void main(String[] args) {
		
		Running running = new Running();
		running.readyToExercise();
		
		Soccer soccer = new Soccer();
		soccer.readyToExercise();
	}
}
