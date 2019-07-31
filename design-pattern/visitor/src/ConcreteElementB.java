/**
 * Created by sccy on 2019/7/31/0031.
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationB(){
        return "具体元素B的操作";
    }
}
