package Template;

public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Jocul de fotbal a fost finisat!");
    }

    @Override
    void initialize() {
        System.out.println("Jocul de fotbal a fost initiat. Incepe sa joci.");
    }

    @Override
    void startPlay() {
        System.out.println("Jocul de fotbal a inceput. Distreaza-te!");
    }
}
