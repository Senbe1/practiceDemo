package demo.juc.AtomicInteger;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author:: liangzhijie
 * @description:
 * @date:
 **/
@Slf4j
public class AtomicIntegerTest2 {
    public static AtomicInteger num = new AtomicInteger(0);

    public static void main(String[] args) {
        for(int i =0;i<3;i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (num.get()<1000){
                        log.info("当前线程：{},当前num:{}",Thread.currentThread().getName(),num.getAndIncrement());
                    }
                }
            });
            t.start();
        }
    }
}
