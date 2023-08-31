package demo.design.test.singketon;

/**
 * @author liangzhijie
 * @date 2023/4/3 18:12
 */
public class SingletonLazyDoubleCheck {
    private volatile static SingletonLazyDoubleCheck INSTANCE;
    private SingletonLazyDoubleCheck(){}
    public static SingletonLazyDoubleCheck getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonLazyDoubleCheck.class){
                if(INSTANCE == null){
                    INSTANCE = new SingletonLazyDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
