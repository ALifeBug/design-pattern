import java.util.ArrayList;
import java.util.List;

/**
 * Created by sccy on 2019/7/29/0029.
 */
public class Prototype implements Cloneable {
    private String name;
    private int age;
    private List<String> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                '}';
    }
    //浅层克隆
    public Prototype shallowClone(){
        try {
            return (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    //深层克隆
    public Prototype deepClone(){
        try {
            Prototype prototype = (Prototype)super.clone();
            List<String> newFriends = new ArrayList<>();
            for(String friend : friends)
                newFriends.add(friend);
            prototype.setFriends(newFriends);
            return prototype;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
