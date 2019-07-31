package simple;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class CarFactory2 {
    public static Car createAudi(){
        return new Audi();
    }
    public static Car createBenz(){
        return new Benz();
    }
}
