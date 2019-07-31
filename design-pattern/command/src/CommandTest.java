/**
 * Created by sccy on 2019/7/30/0030.
 */
public class CommandTest {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call方法");
        ir.call();
    }
}
