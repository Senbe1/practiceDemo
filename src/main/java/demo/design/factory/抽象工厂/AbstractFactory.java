package demo.design.factory.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 17:31
 */
public interface AbstractFactory {
     Color getColor(String color);
     Shape getShape(String shape);
}
