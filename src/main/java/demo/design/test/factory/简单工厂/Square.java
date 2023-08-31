package demo.design.test.factory.简单工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 18:58
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.printf("draw Square");
    }
}
