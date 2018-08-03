package basic.memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
	private int money;
	private List<String> fruits = new ArrayList<String>();
	private Random random = new Random();
	private static String[] fruitsname = {"사과", "포도", "바나나", "귤"};

	public Gamer(int money) {
		this.money = money;
	}

	public int getMoney() {
		return this.money;
	}

	public void bet() {
		int dice = random.nextInt(6) + 1;
		if (dice == 1) {
			this.money += 100;
			System.out.println("소지금이 증가했습니다.");
		} else if (dice == 2) {
			this.money /= 2;
			System.out.println("소지금이 절반이 되었습니다.");
		} else if (dice == 6) {
			String f = getFruit();
			System.out.println("과일(" + f + ")을 받았습니다.");
			this.fruits.add(f);
		} else {
			System.out.println("변한 것이 없습니다.");
		}
	}

	public Memento cretaeMemento() {
		Memento m = new Memento(money);
		Iterator<String> it = fruits.iterator();
		while (it.hasNext()) {
			String f = it.next();
			if (f.startsWith("맛있는")) {
				m.addFruit(f);
			}
		}
		return m;
	}

	public void restoreMemento(Memento memento) {
		this.money = memento.getMoney();
		this.fruits = memento.getFruits();
	}

	public String toString() {
		return "[money = " + this.money + ", fruits = " + fruits + "]";
	}

	private String getFruit() {
		String prefix = "";
		if (random.nextBoolean()) {
			prefix = "맛있는";
		}
		return prefix + fruitsname[random.nextInt(fruitsname.length)];
	}

}
