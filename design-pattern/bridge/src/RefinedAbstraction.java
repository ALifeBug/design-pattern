/**
 * Created by sccy on 2019/7/30/0030.
 */
public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化Refined Abstraction角色被访问");
        implementor.OperationImpl();
    }
}
