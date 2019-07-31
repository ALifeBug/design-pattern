/**
 * Created by sccy on 2019/7/30/0030.
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
