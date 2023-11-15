package demo.design.decorator;

import org.springframework.stereotype.Component;

/**
 * 装饰者抽象类
 * @author liangzhijie
 * @version 1.0
 **/
public abstract class DecoratorComponent implements AbstractComponent {
    private AbstractComponent abstractComponent;

    public DecoratorComponent(AbstractComponent abstractComponent) {
        this.abstractComponent = abstractComponent;
    }

    @Override
    public void handle() {
        abstractComponent.handle();
    }
}
