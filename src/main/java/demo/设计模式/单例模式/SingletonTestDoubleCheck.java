package demo.设计模式.单例模式;

/**
 * @author liangzhijie
 * @date 2023/4/3 10:00
 */
public class SingletonTestDoubleCheck {
    private static SingletonTestDoubleCheck INSTANCE;
    private SingletonTestDoubleCheck(){}
    public static SingletonTestDoubleCheck getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonTestDoubleCheck.class){
                if(INSTANCE == null){
                    INSTANCE = new SingletonTestDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
