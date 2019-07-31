package simple;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class CarFactory {
    public static Car createCar(String type){
        Car c = null;
        if("Audi".equals(type)){
            c = new Audi();
        }else if("Benz".equals(type)){
            c = new Benz();
        }
        return c;
    }
}
