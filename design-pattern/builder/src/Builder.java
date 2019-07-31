/**
 * Created by sccy on 2019/7/29/0029.
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getProduct(){
        return product;
    }
}
