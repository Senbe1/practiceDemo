package demo.设计模式.test;

/**
 * @author liangzhijie
 * @date 2023/4/3 18:15
 */
public class SingletonInnerClass {
    private static class SingletonInnerClassFactory{
        private static SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }
    private SingletonInnerClass(){}
    public static SingletonInnerClass getInstance(){
        return SingletonInnerClassFactory.INSTANCE;
    }
}
