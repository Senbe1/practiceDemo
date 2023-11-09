package demo.design.statePattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class AwardState extends State{

    private Context context;

    public AwardState(Context context) {
        this.context = context;
    }
    @Override
    void handleMoney() {
        log.error("正在发放奖品，不可扣除积分");
    }

    @Override
    boolean handleResult() {
        log.error("正在发放奖品,不可抽奖");
        return false;
    }

    @Override
    void Awards() {
        log.info("恭喜中奖");
        context.getCount();
        if(context.count==0){
            context.setState(new UnAwardState(context));
        }else {
            context.setState(new UnableToDraw(context));
        }
    }
}
