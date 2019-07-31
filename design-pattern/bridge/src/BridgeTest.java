/**
 * Created by sccy on 2019/7/30/0030.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(implementor);
        abs.Operation();
    }
}
