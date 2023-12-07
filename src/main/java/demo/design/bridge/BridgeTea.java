package demo.design.bridge;

import lombok.Getter;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Getter
public abstract class BridgeTea {
    private IMilkTea iMilkTea;

    public BridgeTea(IMilkTea milkTea){
        this.iMilkTea = milkTea;
    };

    public abstract void volume();

}
