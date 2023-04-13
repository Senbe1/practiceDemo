package demo.设计模式.test.工厂模式.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 19:05
 */
public class Red implements Color{
    @Override
    public void genColor() {
        System.out.printf("gen red");
    }
}
