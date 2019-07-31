/**
 * Created by sccy on 2019/7/30/0030.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    public ConcreteCommand() {
        this.receiver = new Receiver();
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
