package demo.design.statePattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 状态对象上下文,其中包含状态属性与状态行为
 * 抽奖活动有四个状态: 可以抽奖、不能抽奖、发放奖品和奖品领完
 *
 * @author liangzhijie
 * @version 1.0
 **/
@Data
@Slf4j
public class Context {

    /**
     * 状态
     */
    State state = null;

    int count = 0;


    /**
     * 初始化奖品数
     *
     * @param count 奖品数
     */

    public Context(int count) {
        this.count = count;
        this.setState(new UnableToDraw(this));
    }

    public void handleMoney() {
        if(count>0){
            log.info("当前还有{}个奖品",count);
            this.state.handleMoney();
        }
    }

    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void awards(){
        if(this.state.handleResult()){
            this.state.Awards();
        }
    }
}
