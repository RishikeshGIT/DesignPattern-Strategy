package designpatterns.strategy;

/**
 * Created by kumarris on 16/05/17.
 */
public class Robot {
    TalkStrategy talkStrategy;
    MoveStrategy moveStrategy;

    public void Robot(){}

    public void talk() {
        talkStrategy.talk();
    }

    public void move() {
        moveStrategy.move();
    }

    public TalkStrategy getTalkStrategy() {
        return talkStrategy;
    }

    public void setTalkStrategy(TalkStrategy talkStrategy) {
        this.talkStrategy = talkStrategy;
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }
}
