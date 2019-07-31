/**
 * Created by sccy on 2019/7/30/0030.
 */
public abstract class Abstraction {
    protected Implementor implementor;
    protected Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    public abstract void Operation();
}
