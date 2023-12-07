package demo.design.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class FlyweightFactory {

    private Map<String,Flyweight> flyweightMap = new HashMap<>();

    public Flyweight getFlyweight(String innerStatus){
        if(!flyweightMap.containsKey(innerStatus)){
            log.info("工厂无该享元对象，需创建并缓存,享元对象为:{}",innerStatus);
            Flyweight flyweight = new ChessFlyweight(innerStatus);
            flyweightMap.put(innerStatus,flyweight);
        }
        return flyweightMap.get(innerStatus);
    }
}
