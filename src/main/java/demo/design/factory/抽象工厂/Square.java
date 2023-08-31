package demo.design.factory.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 17:28
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.printf("draw square");
    }
}
