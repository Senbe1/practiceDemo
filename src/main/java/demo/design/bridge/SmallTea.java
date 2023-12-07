package demo.design.bridge;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
@Getter
public class SmallTea extends BridgeTea{


    public SmallTea(IMilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public void volume() {
        log.info("这是{}号{}","S",super.getIMilkTea().kind());
    }
}
