package common;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class Orange implements Fruit {
    @Override
    public void plant() {
        System.out.println("plant orange");
    }

    @Override
    public void cultivate() {
        System.out.println("cultivate orange");
    }
}
