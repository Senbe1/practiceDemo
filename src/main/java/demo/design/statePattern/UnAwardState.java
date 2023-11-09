package demo.design.statePattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class UnAwardState extends State {


    private Context context;

    public UnAwardState(Context context) {
        this.context = context;
    }

    @Override
    void handleMoney() {
        log.info("无奖可发");
    }

    @Override
    boolean handleResult() {
        log.info("无奖可发");
        return false;
    }

    @Override
    void Awards() {
        log.info("无奖可发");
    }
}
