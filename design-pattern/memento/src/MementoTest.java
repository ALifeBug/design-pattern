/**
 * Created by sccy on 2019/7/31/0031.
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        or.setState("S0");
        System.out.println("初始状态:"+or.getState());
        cr.setMemento(or.createMemento());//保存状态
        or.setState("S1");
        System.out.println("新的状态:"+or.getState());
        or.restoreMemento(cr.getMemento());
        System.out.println("恢复状态:"+or.getState());
    }
}
