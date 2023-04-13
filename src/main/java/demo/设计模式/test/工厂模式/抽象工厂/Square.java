package demo.设计模式.test.工厂模式.抽象工厂;

import demo.设计模式.test.工厂模式.抽象工厂.Shape;

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
