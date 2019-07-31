/**
 * Created by sccy on 2019/7/30/0030.
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void operation(){
        super.operation();
        addedFunction();
    }
    public void addedFunction(){
        System.out.println("为具体构件角色");
    }
}
