package demo.design.adapter.interfaceAdapter;


import lombok.extern.slf4j.Slf4j;

/**
 * @author liangzhijie
 * @version 1.0
 **/
@Slf4j
public class AdapterExpansionForIntface implements TargetInterface {

    private TagUsbInterface tagUsbInterface;

    public AdapterExpansionForIntface(TagUsbInterface tagUsbInterface) {
        this.tagUsbInterface = tagUsbInterface;
    }

    @Override
    public void printTypeCInfo() {
        tagUsbInterface.printInfomation();
        // 经过其他方式处理
        log.info("转为typec接口");
    }

    @Override
    public void printHDMIInfo() {
        tagUsbInterface.printInfomation();
        // 经过其他方式处理
        log.info("转为HDMI接口");
    }

    @Override
    public void printLightingInfo() {
        tagUsbInterface.printInfomation();
        // 经过其他方式处理
        log.info("转为Lighting接口");
    }
}
