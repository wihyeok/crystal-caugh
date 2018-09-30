package khiPattern.memento;

class Originator {

    private String state;

    // The class could also contain additional data that is not part of the

    // state saved in the memento.

  

    public void set(String state) {

        System.out.println("상태 세팅중 --- " + state);

        this.state = state;

    }

  

    public Memento saveToMemento() {

        System.out.println("Memento 저장중");

        return new Memento(state);

    }

  

    public void restoreFromMemento(Memento memento) {

        state = memento.getSavedState();

        System.out.println("복구 후 상태 --- " + state);

    }

  

 
}
