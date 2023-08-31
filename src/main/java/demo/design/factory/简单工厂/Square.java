package demo.design.factory.简单工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 14:29
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.printf("draw square");
    }
}
