package demo.设计模式.test.工厂模式.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 19:11
 */
public class test {
    public static void main(String[] args) {
        AbstractFactory redCircle = new RedCircleFactory();
        redCircle.getColor().genColor();
        redCircle.getShape().draw();
    }
}
