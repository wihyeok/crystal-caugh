package basic.observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random();
	private int number;

	@Override
	public int getNumber() {
		return this.number;
	}

	@Override
	public void execute() {
		for (int i = 0; i < 20; i++) {
			this.number = random.nextInt(50);
			notifyObservers();
		}
	}

}
