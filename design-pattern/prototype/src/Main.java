import java.util.ArrayList;
import java.util.List;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class Main {
    public static void main(String[] args) {
        //创建对象Prototype1
        Prototype Prototype1 = new Prototype();
        //初始化对象
        Prototype1.setName("zhangsan");
        Prototype1.setAge(20);
        List<String> friends = new ArrayList<>();
        friends.add("lisi");
        friends.add("wangwu");
        Prototype1.setFriends(friends);
        //Prototype2是浅层克隆
        Prototype Prototype2 = Prototype1.shallowClone();
        //Prototype3是深层克隆
        Prototype Prototype3 = Prototype1.deepClone();
        //获取浅层克隆的friends的list对象
        List<String> Prototype2_friends = Prototype2.getFriends();
        //向引用对象中添加值
        Prototype2_friends.add("shallow");
        Prototype2.setFriends(Prototype2_friends);
        //获取深层克隆的friends的list对象
        List<String> Prototype3_friends = Prototype3.getFriends();
        //向引用对象中添加值
        Prototype3_friends.add("deep");
        Prototype3.setFriends(Prototype3_friends);

        System.out.println("原型："+Prototype1);
        System.out.println("浅层克隆："+Prototype2);
        System.out.println("深层克隆："+Prototype3);
    }
}
