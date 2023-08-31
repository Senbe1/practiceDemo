package demo.design.factory.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 17:28
 */
public class Red implements Color {

    @Override
    public void genColor() {
        System.out.printf("get red");
    }
}
