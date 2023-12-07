package demo.design.adapter.classAdapter;

/**
 * @author liangzhijie
 * @version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        TargetTypeCInterface targetTypeCInterface = new AdapterExpansion();
        targetTypeCInterface.printTypeCInfo();
    }
}
