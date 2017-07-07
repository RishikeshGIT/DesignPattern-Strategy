package designpatterns.strategy;

/**
 * Created by kumarris on 16/05/17.
 */
public class GentleRobot extends Robot {
    public GentleRobot() {
        setMoveStrategy(new MoveCalmly());
        setTalkStrategy(new TalkPolitely());
    }
}
