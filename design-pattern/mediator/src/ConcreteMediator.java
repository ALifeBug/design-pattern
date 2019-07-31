import java.util.ArrayList;
import java.util.List;

/**
 * Created by sccy on 2019/7/30/0030.
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<>();
    public void register(Colleague colleague){
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }
    public void relay(Colleague cl){
        for(Colleague ob : colleagues){
            if(!ob.equals(cl)){
                ob.receive();
            }
        }
    }
}
