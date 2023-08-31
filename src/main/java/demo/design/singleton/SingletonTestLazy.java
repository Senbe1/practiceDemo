package demo.design.singleton;

/**
 * @author liangzhijie
 * @date 2023/4/3 09:43
 */
public class SingletonTestLazy {

    private static SingletonTestLazy INSTANCE = new SingletonTestLazy();

    private SingletonTestLazy() {
    }

    public synchronized static SingletonTestLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonTestLazy();
        }
        return INSTANCE;
    }
}
