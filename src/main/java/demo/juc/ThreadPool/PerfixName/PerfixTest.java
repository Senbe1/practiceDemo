package demo.juc.ThreadPool.PerfixName;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class PerfixTest {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 10, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), new MyThreadPool("PerfixNameTest"));
        List<MyTask> myTaskList = new ArrayList<>();
        myTaskList.add(new MyTask(true));
        myTaskList.add(new MyTask(true));
        myTaskList.add(new MyTask(true));
        try {
            poolExecutor.invokeAll(myTaskList);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }
}
