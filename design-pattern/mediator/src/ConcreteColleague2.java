/**
 * Created by sccy on 2019/7/30/0030.
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求");
        mediator.relay(this);//请中介者转发
    }
}
