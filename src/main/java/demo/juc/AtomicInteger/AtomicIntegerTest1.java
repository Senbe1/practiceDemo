package demo.juc.AtomicInteger;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:: liangzhijie
 * @description:
 * @date:
 **/
@Slf4j
public class AtomicIntegerTest1 {
    private static Integer num = 0;

    public static void main(String[] args) {
        for(int i=0 ;i<3;i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (num<1000){
                        num++;
                        log.info("线程：{},num={}",Thread.currentThread().getName(),num);
                    }
                }
            });
            t.start();
        }
    }
}
