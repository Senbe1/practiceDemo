package demo.design.factory.抽象工厂;


/**
 * @author liangzhijie
 * @date 2023/4/12 17:32
 */
public class RedCircleFactory implements AbstractFactory{
    @Override
    public Color getColor(String color) {
        return new Red();
    }

    @Override
    public Shape getShape(String shape) {
       return new Circle();
    }
}
