package demo.design.statePattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class StatePatternTest {
    public static void main(String[] args) {
        // 初始化三个奖品
        Context context = new Context(2);
        for (int i = 0; i < 30; i++) {
            log.info("当前为第{}次抽奖", i + 1);
            context.handleMoney();
            context.awards();
        }
    }
}
