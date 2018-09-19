package khiPattern.observer;

import java.util.LinkedList;
import java.util.List;

public class Avengers implements Subject{
	private List<Observer> heros;
	private EnemyStatus stat;
	
	public Avengers(){
		System.out.println("어벤져스 창설");
		heros = new LinkedList<Observer>();
	}
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		heros.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		if(heros.contains(observer)){
			heros.remove(observer);
		} 
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer hero : heros){
			hero.update(stat);
		}
	}
	
	public void setStat(EnemyStatus stat) {
		this.stat = stat;
		notifyObservers();
	}
	
	public List<Observer> getMembers(){
		return this.heros;
	}

}
