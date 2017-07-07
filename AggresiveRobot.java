package designpatterns.strategy;

/**
 * Created by kumarris on 16/05/17.
 */
public class AggresiveRobot extends Robot {
    public AggresiveRobot() {
        setMoveStrategy(new MoveAggresively());
        setTalkStrategy(new TalkAngrily());
    }
}
