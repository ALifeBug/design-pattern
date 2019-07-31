/**
 * Created by sccy on 2019/7/31/0031.
 */
public class VisitorTest {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("----------------");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
