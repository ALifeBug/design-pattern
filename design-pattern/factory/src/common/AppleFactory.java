package common;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}
