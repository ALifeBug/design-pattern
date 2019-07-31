/**
 * Created by sccy on 2019/7/30/0030.
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague colleague);
}
