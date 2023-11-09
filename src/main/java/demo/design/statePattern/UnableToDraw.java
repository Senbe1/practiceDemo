package demo.design.statePattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class UnableToDraw extends State {

    private final Context context;

    public UnableToDraw(Context context) {
        this.context = context;
    }


    @Override
    void handleMoney() {
        if (context.count > 0) {
            log.info("当前可以抽奖，需扣除50积分");
            context.setState(new AbleToDraw(context));
        }
    }

    @Override
    boolean handleResult() {
        log.error("未扣除积分，无法抽奖");
        return false;
    }

    @Override
    void Awards() {
        log.info("未扣除积分，无法获取是否中奖");
    }
}
