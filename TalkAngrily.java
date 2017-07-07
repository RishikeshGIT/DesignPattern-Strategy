package designpatterns.strategy;

/**
 * Created by kumarris on 16/05/17.
 */
public class TalkAngrily implements TalkStrategy {
    public void talk() {
        System.out.println("Hi!! I am talking angrily now.");
    }
}
