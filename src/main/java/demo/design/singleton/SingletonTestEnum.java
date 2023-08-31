package demo.design.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangzhijie
 * @date 2023/4/3 10:10
 */
public enum SingletonTestEnum {
    INSTANCE;
    private Map<String, Object> configs = new HashMap<>();

    public void setProperty(String key, Object value) {
        configs.put(key, value);
    }

    public Object getProperty(String key) {
        return configs.get(key);
    }
}
