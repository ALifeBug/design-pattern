import java.util.ArrayList;

/**
 * Created by sccy on 2019/7/30/0030.
 */
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<>();
    @Override
    public void add(Component c) {
        children.add(c);
    }
    @Override
    public void remove(Component c) {
        children.remove(c);
    }
    @Override
    public Component getChild(int i) {
        return children.get(i);
    }
    @Override
    public void operation() {
        for(Component component : children){
            component.operation();
        }
    }
}
