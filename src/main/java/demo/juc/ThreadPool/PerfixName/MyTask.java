package demo.juc.ThreadPool.PerfixName;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

/**
 * @author:: liangzhijie
 * @description:
 * @date: 20230912
 **/
@Data
@Slf4j
public class MyTask implements Callable<Boolean> {
    private Boolean flag;

    public MyTask(boolean flag){
        this.flag = flag;
    }
    @Override
    public Boolean call() throws Exception {
        if (flag) {
            log.info("this threadName is {}",Thread.currentThread().getName());
            return flag;
        } else {
            throw new Exception("this is a test!");
        }
    }
}
