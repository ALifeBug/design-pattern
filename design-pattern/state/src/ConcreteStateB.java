/**
 * Created by sccy on 2019/7/30/0030.
 */
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是B");
        context.setState(new ConcreteStateA());
    }
}
