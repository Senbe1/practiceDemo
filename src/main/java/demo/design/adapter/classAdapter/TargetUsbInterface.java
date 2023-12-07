package demo.design.adapter.classAdapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 源，usb接口
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class TargetUsbInterface {
    public void printInfomation(){
        log.info("这是usb输入口");
    }
}
