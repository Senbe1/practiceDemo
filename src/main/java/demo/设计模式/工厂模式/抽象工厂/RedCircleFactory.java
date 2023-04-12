package demo.设计模式.工厂模式.抽象工厂;


import org.springframework.util.StringUtils;

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
