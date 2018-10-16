/*

	* Iterator 패턴이란?
	
		여러 개의 요소가 모여있는 집합체에서, 전체에 대해서 순서대로 검색하는 처리를 위한 패턴
		반복자라고도 부름
	
	* List.class를 상속받은 클래스 내의 iterator 패턴
	
		1. ArrayList의 iterator
			- Iterator 인터페이스를 구현
			- hasNext() : 다음 요소의 cursor index가 사이즈와 다를 시 true를 리턴
			- next() : cursor의 값이 사이즈보다 크거나 같으면 NoSuchElementException(), 
			           cursor의 값이 해당 Arraylist의 elementData.length보다 크다면 ConcurrentModificationException(),
			           pass시 cursor를 +1 시키고 해당 요소를 리턴]
			- remove() : 다음 차례에 해당하는 요소를 제거
			- forEachRemaining() : ?           

	  	2. map의 iterator
	  	    - map에서는 keySet과 entrySet을 통해 Map 안의 내용을 탐색할 수 있음
	  	    - keySet() : map 내의 key 값을 모두 리턴해준다.
	  	                 keySet은 .iterator() 통해 사용할 수도 있고, for문을 통해서 사용할 수도 있음.
	  	    - entrySet() : map 내의 key와 value의 값을 리턴해준다.
	
*/