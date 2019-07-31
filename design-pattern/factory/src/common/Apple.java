package common;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class Apple implements Fruit {
    @Override
    public void plant() {
        System.out.println("plant apple");
    }

    @Override
    public void cultivate() {
        System.out.println("cultivate apple");
    }
}
