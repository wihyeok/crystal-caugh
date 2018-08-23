/* 
singleton 방법 



1. 고전적방법 
싱글톤 객체를 선언과 동시에 생성하는 방법 
사용하지 않을 경우 메모리 낭비할수있음 
클래스 로딩시 생성대므로 멀티쓰레드 환경에서 동기화 보장(클래스 로딩하고 초기화 하는 시점은 thread-safe를 보장) 

2. 빠른초기화
getInstance에서 singleton변수가 null이면 new로 인스턴스 새성해주고 객체가 존재하면 그대로 리턴해줌
함수단위라서 멀티쓰레드 환경에서는 동기화 시켜줘야함
getInstance함수 자체를 syn하는 방법 - 동기화 오버헤드가 클 수 있기 때문에 
     객체가 null일때만 syn를 걸어주면 댐   ( DCL - double-checking Locking )

3. LazyHolder (가장 많이쓰임)
syn도 필요없음..
중첩클래스(Holder)를 이용하는 방법으로 모든 자바 버전에서 동작함
처음 getInstance 메소드 호출시 singletonHolder 클래스가 클래스 로더에 의해 로딩 대면서 싱글톤 객체 생성이 이루어짐. (클래스 로딩하고 초기화 하는 시점은 thread-safe를 보장)

4. enum initialization 
enum이 싱글톤으로 사용될 수 있는 이유는 instance가 생성될 때 멀티 스레드로부터 안전하기 때문. enum value는 자바 전역에서 접근이 가능함. 




*/