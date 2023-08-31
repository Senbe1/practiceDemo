package demo.design.test.factory.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 19:04
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.printf("Square Shape");
    }
}
