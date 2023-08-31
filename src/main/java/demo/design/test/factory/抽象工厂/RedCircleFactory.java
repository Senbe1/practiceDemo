package demo.design.test.factory.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 19:07
 */
public class RedCircleFactory implements AbstractFactory {
    @Override
    public Color getColor() {
        return new Red();
    }

    @Override
    public Shape getShape() {
        return new Circle();
    }
}
