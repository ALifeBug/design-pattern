import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sccy on 2019/7/31/0031.
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();
    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return (Iterator) new ConcreteIterator(list);
    }
}
