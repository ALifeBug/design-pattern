/**
 * Created by sccy on 2019/7/30/0030.
 */
public class ConcreteStateA extends State {

    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是A");
        context.setState(new ConcreteStateB());
    }
}
