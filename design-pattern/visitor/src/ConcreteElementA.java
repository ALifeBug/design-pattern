/**
 * Created by sccy on 2019/7/31/0031.
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationA(){
        return "具体元素A的操作";
    }
}