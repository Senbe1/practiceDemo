package demo.设计模式.test.单例模式;

/**
 * @author liangzhijie
 * @date 2023/4/3 18:11
 */
public class SingletonHungry {
    private static final SingletonHungry INSTANCE = new SingletonHungry();
    private SingletonHungry(){}
    public static SingletonHungry getInstance(){
        return INSTANCE;
    }
}
