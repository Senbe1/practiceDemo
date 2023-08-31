package demo.design.factory.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 17:44
 */
public class GreenSquareFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        return new Green();
    }

    @Override
    public Shape getShape(String shape) {
        return new Square();
    }
}
