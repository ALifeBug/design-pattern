/**
 * Created by sccy on 2019/7/30/0030.
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1,c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("----------------");
        c2.send();
    }
}
