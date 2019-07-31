/**
 * Created by sccy on 2019/7/30/0030.
 */
public interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
