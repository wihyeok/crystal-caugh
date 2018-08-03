package basic.memento.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Memento implements Serializable {

	private static final long serialVersionUID = 1L;
	int money;
	ArrayList<String> fruits;

	public int getMoney() {	// narrow interface 제공되는 정보는 작지만 public --> 어떤 클래스도 접근 가능한 제한적 정보 제공
		return this.money;
	}

	Memento(int money) {	// wide interface 제공되는 정보는 많지만 default --> 패키지 내 클래스만 접근 가능한 다양한 정보 제공
		this.money = money;
		this.fruits = new ArrayList<String>();
	}

	void addFruit(String fruit) {	// wide interface
		this.fruits.add(fruit);
	}

	@SuppressWarnings("unchecked")
	List<String> getFruits() {	// wide interface
		return (List<String>) this.fruits.clone();
	}

}
