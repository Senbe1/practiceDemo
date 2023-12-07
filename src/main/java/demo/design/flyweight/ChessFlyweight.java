package demo.design.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体的享元对象。
 *
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class ChessFlyweight implements Flyweight {

    private final String innerStatus;

    public ChessFlyweight(String innerStatus) {
        this.innerStatus = innerStatus;
    }

    @Override
    public void deal(int outStatus) {
        // 根据外部状态的不同，作出不同的操作。这里用int值代表生成的棋子是第几个。
        // 当然这里只是简单的作了输出内部状态与外部状态的信息，应该可以针对不同状态作出更多变的处理。
        log.info("生成{}棋，这是第{}个棋子", this.innerStatus, outStatus);
    }
}
