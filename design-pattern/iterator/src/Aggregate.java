import java.util.Iterator;

/**
 * Created by sccy on 2019/7/31/0031.
 */
public interface Aggregate {
    void add(Object object);
    void remove(Object object);
    Iterator getIterator();
}
