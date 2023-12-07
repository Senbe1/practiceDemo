package demo.design.flyweight;

/**
 * 享元接口，根据不同的外部状态可以做不同的处理
 * @author liangzhijie
 * @version 1.0
 **/
public interface Flyweight {
    void deal(int outStatus);
}
