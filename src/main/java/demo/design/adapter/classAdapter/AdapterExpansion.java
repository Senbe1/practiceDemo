package demo.design.adapter.classAdapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class AdapterExpansion extends TargetUsbInterface implements TargetTypeCInterface{

    @Override
    public void printTypeCInfo() {
        super.printInfomation();
        // 经过其他方式处理
        log.info("转为typec接口");
    }
}
