import java.util.List;

/**
 * Created by sccy on 2019/7/31/0031.
 */
public class ConcreteIterator implements Iterator {

    private List<Object> list;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object object = list.get(index);
        return object;
    }

    @Override
    public Object next() {
        Object object = null;
        if(this.hasNext()){
            object = list.get(++index);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        if(index<list.size()-1)
            return true;
        return false;
    }
}
