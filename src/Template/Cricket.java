package Template;

public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Jocul de cricket s-a terminat!");
    }

    @Override
    void initialize() {
        System.out.println("Jocul de cricket a fost initializat!");
    }

    @Override
    void startPlay() {
        System.out.println("Jocul de cricket a inceput!");
    }
}
