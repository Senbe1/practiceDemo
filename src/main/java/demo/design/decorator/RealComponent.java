package demo.design.decorator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体接口实现类
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class RealComponent implements AbstractComponent{
    @Override
    public void handle() {
        log.info("实现类实现具体方法");
    }
}
