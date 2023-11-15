package demo.design.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体装饰者类
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class RealDecoratorComponent extends DecoratorComponent{

    private AbstractComponent abstractComponent;
    public RealDecoratorComponent(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    public void handle(){
        log.info("原逻辑前处理");
        super.handle();
        log.info("原逻辑后处理");
    }
}
