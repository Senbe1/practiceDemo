package demo.设计模式.单例模式;

/**
 * @author liangzhijie
 * @date 2023/4/3 09:45
 */
public class SingletonTestHungry {
    private static final SingletonTestHungry INSTANCE = new SingletonTestHungry();

    private SingletonTestHungry() {
    }


    public static SingletonTestHungry getInstance() {
        return INSTANCE;
    }
}
