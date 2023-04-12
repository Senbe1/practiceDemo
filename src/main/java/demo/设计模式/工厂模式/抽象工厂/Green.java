package demo.设计模式.工厂模式.抽象工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 17:29
 */
public class Green implements Color{
    @Override
    public void genColor() {
        System.out.printf("get green");
    }
}
