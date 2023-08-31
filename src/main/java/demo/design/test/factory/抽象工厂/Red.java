package demo.design.test.factory.抽象工厂;

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
