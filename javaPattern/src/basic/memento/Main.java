package basic.memento;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import basic.memento.game.Gamer;
import basic.memento.game.Memento;

public class Main {

	public static void main(String[] args) {
		File f = new File("game.dat");
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.cretaeMemento();
		if (f.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				memento = (Memento) ois.readObject();
				gamer.restoreMemento(memento);
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 0; i < 100; i++) {
			System.out.println("=== " + i);
			System.out.println("현상: " + gamer);

			gamer.bet();

			System.out.println("소지금은 " + gamer.getMoney());

			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println(" (많이 증가했으므로 현재의 상태를 저장)");
				memento = gamer.cretaeMemento();
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println(" (많이 감소했으므로 이전의 상태로 복원)");
				gamer.restoreMemento(memento);
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			System.out.println(" ");
		}
	}

}
