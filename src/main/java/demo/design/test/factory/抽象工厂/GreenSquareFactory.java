package demo.design.test.factory.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 19:10
 */
public class GreenSquareFactory implements AbstractFactory{
    @Override
    public Color getColor() {
        return new Green();
    }

    @Override
    public Shape getShape() {
        return new Square();
    }
}
