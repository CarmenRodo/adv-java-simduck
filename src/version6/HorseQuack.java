package version6;

/**
 * This is an implementation (low-level object) of the QuackStrategy
 */
public class HorseQuack implements QuackStrategy {

    @Override
    public void quack() {
        System.out.println("Heeeeee");
    }

}
