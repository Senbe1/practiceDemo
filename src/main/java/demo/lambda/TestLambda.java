package demo.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class TestLambda {
    public static void main(String[] args) {
       NoParameterNoReturn noParameterNoReturn = ()->{log.info("无参数无返回值");};
       noParameterNoReturn.test();
       OneParameterNoReturn oneParameterNoReturn = (a)->{log.info("单参数无返回值：参数值{}",a);};
       oneParameterNoReturn.test(12);
    }
}
