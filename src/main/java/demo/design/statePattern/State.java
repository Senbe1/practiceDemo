package demo.design.statePattern;

/**
 * 抽象状态类，状态对象上下文中的对象都应该实现该类
 * @author liangzhijie
 * @version 1.0
 **/
public abstract class State {

    /**
     * 行为方法1:扣除50分
     */
     abstract void handleMoney();

    /**
     * 是否中奖
     */
    abstract boolean handleResult();

    /**
     * 发放奖品
     */
    abstract void Awards();
}
