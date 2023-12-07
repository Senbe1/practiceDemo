package demo.design.bridge;

/**
 * @author liangzhijie
 * @version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        SmallTea smallGreenTea  = new SmallTea(new GreenTea());
        SmallTea smallBubbleTea  = new SmallTea(new BubbleTea());

        smallGreenTea.volume();
        smallBubbleTea.volume();
    }
}
