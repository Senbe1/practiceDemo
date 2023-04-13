package demo.设计模式.test.工厂模式.简单工厂;

import org.springframework.util.StringUtils;

/**
 * @author liangzhijie
 * @date 2023/4/12 18:58
 */
public class ShapeFactory {
    public Shape getShape(String type){
//        if(StringUtils.isEmpty(type)){
//            return null;
//        }
        if("circle".equalsIgnoreCase(type)){
            return new Circle();
        }
        if("Square".equalsIgnoreCase(type)){
            return new Square();
        }
        return null;
    }
}
