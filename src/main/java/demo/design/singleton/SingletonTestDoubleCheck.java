package demo.design.singleton;

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
