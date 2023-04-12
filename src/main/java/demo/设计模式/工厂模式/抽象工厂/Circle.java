package demo.设计模式.工厂模式.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 17:27
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.printf("draw circle");
    }
}
