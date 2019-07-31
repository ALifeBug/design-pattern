/**
 * Created by sccy on 2019/7/30/0030.
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
