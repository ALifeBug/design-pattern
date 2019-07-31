/**
 * Created by sccy on 2019/7/30/0030.
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试");
        Target target = new ClassAdapter();
        target.request();
    }
}
