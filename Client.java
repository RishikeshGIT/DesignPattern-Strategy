package designpatterns.strategy;

/**
 * Created by kumarris on 16/05/17.
 */
public class Client {

    public static void main(String[] args) {
        Robot goodRobo = new GentleRobot();
        Robot badRobo = new AggresiveRobot();

        goodRobo.move();
        goodRobo.talk();

        badRobo.move();
        badRobo.talk();
    }
}
