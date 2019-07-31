/**
 * Created by sccy on 2019/7/30/0030.
 */
public abstract class Colleague {
    protected Mediator mediator;
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}
