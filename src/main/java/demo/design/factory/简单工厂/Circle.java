package demo.design.factory.简单工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 14:20
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
