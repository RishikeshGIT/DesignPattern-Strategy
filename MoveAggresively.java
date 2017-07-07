package designpatterns.strategy;

/**
 * Created by kumarris on 16/05/17.
 */
public class MoveAggresively implements MoveStrategy {
    public void move() {
        System.out.println("Hi!! I am moving aggresively now.");
    }
}
