package demo.设计模式.工厂模式.简单工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 14:33
 */
public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("circle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
    }
}
