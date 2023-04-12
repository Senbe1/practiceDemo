package demo.设计模式.工厂模式.简单工厂;

/**
 * @author liangzhijie
 * @date 2023/4/12 14:30
 */
public class ShapeFactory {
    public Shape getShape(String type){
        if(type ==null){
            return null;
        }
        if("circle".equalsIgnoreCase(type)){
            return new Circle();
        }else if("Square".equalsIgnoreCase(type)){
            return new Square();
        }
        return null;
    }
}
