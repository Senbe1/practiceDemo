package demo.design.singleton;

/**
 * @author liangzhijie
 * @date 2023/4/3 09:47
 */
public class SingletonTestStaticInnerClass {
    private SingletonTestStaticInnerClass(){};
    private static class SingletonHelper{
        private static SingletonTestStaticInnerClass INSTANCE = new SingletonTestStaticInnerClass();
    }
    public static SingletonTestStaticInnerClass getInstance(){
       return SingletonHelper.INSTANCE;
    }
}
