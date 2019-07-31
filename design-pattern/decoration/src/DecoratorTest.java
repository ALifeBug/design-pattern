/**
 * Created by sccy on 2019/7/30/0030.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("-----------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
