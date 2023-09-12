package demo.juc.ThreadPool.PerfixName;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author:: liangzhijie
 * @description:
 * @date: 20230912
 **/
public class MyThreadPool implements ThreadFactory {
    private String perfixName;
    private AtomicInteger count = new AtomicInteger(0);

    public MyThreadPool(String perfixName) {
        this.perfixName = perfixName;
    }

    @Override
    public Thread newThread(Runnable r) {
        String threadName = perfixName+"-"+count.incrementAndGet();
        return new Thread(r,threadName);
    }
}
