package demo.design.statePattern;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class AbleToDraw extends State {

    private final Context context;

    public AbleToDraw(Context context) {
        this.context = context;
    }

    @Override
    void handleMoney() {
        log.info("已经扣除积分，可以抽奖");
    }

    @Override
    boolean handleResult() {
        log.info("正在抽奖，请稍后");
        Random random = new Random();
        // 10%概率
        int i = random.nextInt(10);
        if (i == 0) {
            log.info("中奖");
            // 设置状态为发放奖品状态
            if (context.count > 0) {
                context.setState(new AwardState(context));
                return true;
            }

        }

        // 设置状态为不可抽奖状态
        if (context.count == 0) {
            context.setState(new UnAwardState(context));
            log.info("当前无法抽奖");
            return false;
        }
        log.info("未中奖");
        context.setState(new UnableToDraw(context));
        return false;
    }

    @Override
    void Awards() {

    }
}
