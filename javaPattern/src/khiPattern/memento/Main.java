package khiPattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	
	/**
	 * 텍트에디터 같은 곳에서 undo, redo 등의 기능을 구현할 때 사용하기도 하는 패턴이기도 하며
	 * 인스턴스 정보를 캡슐화하는 방법까지 학습할 수 있는 패턴입니다.
	 * 공부한거 올려주세요~ 트렐로에서 다 하셨으면 done으로 바꿔주세요~
	 *
	 *
	 *
	 * 과장님 그런데 제가 올린거는 memento를 List로 가지고있자나여 
	 * 근데 책에 예제는  memento를 List가 없고 fruits를 리스트로가지는데....
	 * 이전의 상태를 저장하고 롤백하는거라는것은 알겠는데 
	 * 그냥 구현의 차이인가여?... 두방식다 memento패턴인가여???
	 */
	
	 public static void main(String[] args) {

		 
		 /* originator - 내부 상태 저장 
		  * Main - 메멘토 순서 담당 
		  * 
		  * 
		  * */
	        List<Memento> savedStates = new ArrayList<Memento>();	  

	        Originator originator = new Originator();

	        originator.set("level_1");
	        originator.set("level_2");  
	        originator.set("level_3");

	        savedStates.add(originator.saveToMemento());

	        originator.set("level_4");

	        // We can request multiple mementos, and choose which one to roll back to.

	        savedStates.add(originator.saveToMemento());

	        originator.set("level_5");
	       
	        savedStates.add(originator.saveToMemento());
	  
	        originator.set("level_6");
	        originator.set("level_7");
	        originator.set("level_8");
	       
	        savedStates.add(originator.saveToMemento());
	  	  
	        System.out.println("----저장 이력----");
	        for(int i=savedStates.size()-1;i>=0;i--) {
	        	originator.restoreFromMemento(savedStates.get(i));   	
	        }
	        
	    }


}
