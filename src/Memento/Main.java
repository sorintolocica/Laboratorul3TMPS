package Memento;

public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("Starea #1");
        originator.setState("Starea #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Starea #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Starea #4");
        System.out.println("Starea curenta: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("Prima stare salvata: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("A doua stare salvata: " + originator.getState());
    }
}