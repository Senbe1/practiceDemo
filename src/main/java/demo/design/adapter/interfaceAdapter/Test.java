package demo.design.adapter.interfaceAdapter;

/**
 * @author liangzhijie
 * @version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        AdapterExpansionForIntface adapterExpansionForIntface = new AdapterExpansionForIntface(new TagUsbInterface());

        adapterExpansionForIntface.printTypeCInfo();
        adapterExpansionForIntface.printHDMIInfo();
        adapterExpansionForIntface.printLightingInfo();
    }
}
