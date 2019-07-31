# 设计模式

本文内容参考自[C语言中文网-设计模式](http://c.biancheng.net/view/1320.html)

## 分类

根据模式用来完成什么工作区分:

- 创建型模式：用于描述"怎样创建对象"，它的主要特点是"将对象的创建和使用分离"。包括**单例**，**原型**，**工厂方法**，**抽象工厂**，**建造者**。
- 结构型模式：用于描述如何将类或对象按某种布局组成更大的结构。包括**代理**，**适配器**，**桥接**，**装饰**，**外观**，**享元**，**组合**。
- 行为型模式：用于描述类或对象之间怎样相互协作共同完成单个对象无法单独完成的任务，以及怎样分配职责。包括**模板方法**，**策略**，**命令**，**职责链**，**状态**，**观察者**，**中介者**，**迭代器**，**访问者**，**备忘录**，**解释器**。

## 功能介绍

- **单例模式**：某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例。
- **原型模式**：将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。
- **工厂方法模式**：定义一个用于创建产品的接口，由子类决定生产什么产品。
- **抽象工厂模式**：提供一个创建产品族的接口，其每一个子类可以生产一系列相关的产品。
- **建造者模式**：将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成复杂对象。
- **代理模式**：为对象提供一种代理以控制对该对象的访问。即客户端通过代理间接的访问该对象，从而限制，增强或修改该对象的一些特性。
- **适配器模式**：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
- **桥接模式**：将抽象与实现分离，使得他们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现两个可变维度的耦合度。
- **装饰模式**：动态的给对象增加一些职责，即增加其额外的功能。
- **外观模式**：为多个复杂的子系统提供一个一致的接口，使得这些子系统更加容易被访问。
- **享元模式**：运用共享技术来有效的支持大量细粒度对象的复用。
- **组合模式**：将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。
- **模板方法模式**：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重新定义该算法的某些特定步骤。
- **策略模式**：定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的改变不会影响使用算法的客户。
- **命令模式**：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
- **职责链模式**：将请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。
- **状态模式**：允许一个对象在其内部状态发生改变时改变其行为能力。
- **观察者模式**：多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为。
- **中介者模式**：定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象不必相互了解。
- **迭代器模式**：提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
- **访问者模式**：在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问。
- **备忘录模式**：在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。
- **解释器模式**：提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。

## UML箭头

- **依赖**：使用的关系，带普通箭头的虚线，指向被使用者。
- **关联**：拥有的关系，带普通箭头的实线，指向被拥有者。
- **聚合**：整体与部分的关系，带空心菱形的实线，指向整体。
- **组合**：整体与部分的关系，但不能离开整体单独存在，带实心菱形的实线，指向整体。
- **泛化**：继承的关系，带空心三角箭头的实线，箭头从子类指向父类。
- **实现**：实现的关系，带空心三角箭头的虚线，指向接口。

## 设计原则

- **开闭原则**：对扩展开放，对修改关闭。
- **里氏替换原则**：子类可以扩展父类的功能，但不能改变父类原有的功能。
- **依赖倒置原则**：面向接口编程，不要面向实现编程，降低类间的耦合性。
- **单一职责原则**：一个类应该有且仅有一个引起它变化的原因，否则类应该被拆分。
- **接口隔离原则**：要为各个类建立它们需要的专用接口，而不要试图去建立一个很庞大的接口供其他类调用。
- **迪米特法则**：如果两个软件实体无须直接通信，那么就不应该发生直接的相互调用，可通过第三方转发应用。
- **合成复用原则**：软件复用时，尽量先使用组合或聚合等关联关系实现，其次考虑使用继承关系实现。

## 设计模式

### 单例模式

- 饿汉式

  ```java
  public class Singleton {
      private static Singleton singleton = new Singleton();
      private Singleton(){}
      public static Singleton getSingleton(){
          return singleton;
      }
  }
  ```

- 单线程懒汉式

  ```java
  public class Singleton {
      private static Singleton singleton;
      private Singleton(){}
      public static Singleton getSingleton(){
          if(singleton == null) singleton = new Singleton();
          return singleton;
      }
  }
  ```

- 多线程懒汉式(效率低)

  ```java
  public class Singleton {
      private static Singleton singleton = null;
      private Singleton(){}
      public static synchronized Singleton getSingleton(){
          if(singleton == null){
              singleton = new Singleton();
          }
          return singleton;
      }
  }
  ```

- 多线程懒汉式(效率高)

  ```java
  public class Singleton {
      private volatile static Singleton singleton;
      private Singleton(){}
      public static Singleton getSingleton(){
          if(singleton == null){
              synchronized (Singleton.class){
                  if(singleton == null){
                      singleton = new Singleton();
                  }
              }
          }
          return singleton;
      }
  }
  ```

- 静态内部类法

  ```java
  public class Singleton {
      private static class Holder{
          private static Singleton singleton = new Singleton();
      }
      private Singleton(){}
      public static Singleton getSingleton(){
          return Holder.singleton;
      }
  }
  //Singleton 类被装载了，instance 不一定被初始化。因为Holder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载Holder 类，从而实例化 instance。
  ```

- 枚举法(最佳，自动支持序列化机制，防止反射强行调用构造器)

  ```java
  public enum  Singleton {
      INSTANCE;
      private String name;
      public String getName(){
          return name;
      }
      public void setName(String name) {
          this.name = name;
      }
  }
  ```

  一般情况下，不建议使用线程不安全的懒汉式和线程安全但效率低下的懒汉式，建议使用饿汉式。只有在要求懒加载的情况下，才会使用静态内部类的方式。如果涉及到反序列化创建对象时，可以尝试使用枚举方式。如果有其他特殊需求，可以使用双重锁方式。应用场景主要有计数器，配置对象，数据库线程池等。

### 原型模式

```java
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
```

```java
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
运行结果：
原型：Prototype{name='zhangsan', age=20, friends=[lisi, wangwu, shallow]}
浅层克隆：Prototype{name='zhangsan', age=20, friends=[lisi, wangwu, shallow]}
深层克隆：Prototype{name='zhangsan', age=20, friends=[lisi, wangwu, deep]}
```

原型模式适用于：对象之间相同或相似，即只是个别的几个属性不同的时候；对象的创建过程比较麻烦，但复制比较简单的时候。

### 工厂模式

- 简单工厂模式

  ```java
  public interface Car {
      static void run(){}
  }
  public class Audi implements Car{
      public void run(){
          System.out.println("audi running");
      }
  }
  public class Benz implements Car{
      public void run(){
          System.out.println("benz running");
      }
  }
  public class CarFactory {
      public static Car createCar(String type){
          Car c = null;
          if("Audi".equals(type)){
              c = new Audi();
          }else if("Benz".equals(type)){
              c = new Benz();
          }
          return c;
      }
  }
  public class CarFactory2 {
      public static Car createAudi(){
          return new Audi();
      }
      public static Car createBenz(){
          return new Benz();
      }
  }
  ```

- 工厂方法模式

  ```java
  public interface Fruit {
      void plant();
      void cultivate();
  }
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
  public class Orange implements Fruit {
      @Override
      public void plant() {
          System.out.println("plant orange");
      }
  
      @Override
      public void cultivate() {
          System.out.println("cultivate orange");
      }
  }
  public class AppleFactory implements FruitFactory {
      @Override
      public Fruit createFruit() {
          return new Apple();
      }
  }
  public class OrangeFactory implements FruitFactory {
      @Override
      public Fruit createFruit() {
          return new Orange();
      }
  }
  ```

  使用场景：日志记录，用户可以选择记录日志到本地硬盘，系统事件，远程服务器等；数据库访问，用户不确定最后系统使用哪一类数据库时；一般使用简单工厂模式。

### 抽象工厂模式

```java
public interface Shape {
   void draw();
}
public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
```

```java
public interface Color {
   void fill();
}
public class Red implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}
public class Green implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}
public class Blue implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}
```

```java
public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape) ;
}
public class ShapeFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}
public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      } else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
      } else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}
public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      return null;
   }
}
```

```java
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
 
      //获取形状工厂
      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
 
      //获取形状为 Circle 的对象
      Shape shape1 = shapeFactory.getShape("CIRCLE");
 
      //调用 Circle 的 draw 方法
      shape1.draw();
 
      //获取形状为 Rectangle 的对象
      Shape shape2 = shapeFactory.getShape("RECTANGLE");
 
      //调用 Rectangle 的 draw 方法
      shape2.draw();
      
      //获取形状为 Square 的对象
      Shape shape3 = shapeFactory.getShape("SQUARE");
 
      //调用 Square 的 draw 方法
      shape3.draw();
 
      //获取颜色工厂
      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
 
      //获取颜色为 Red 的对象
      Color color1 = colorFactory.getColor("RED");
 
      //调用 Red 的 fill 方法
      color1.fill();
 
      //获取颜色为 Green 的对象
      Color color2 = colorFactory.getColor("Green");
 
      //调用 Green 的 fill 方法
      color2.fill();
 
      //获取颜色为 Blue 的对象
      Color color3 = colorFactory.getColor("BLUE");
 
      //调用 Blue 的 fill 方法
      color3.fill();
   }
}
```

 抽象工厂模式是**工厂方法模式的升级版本**，在有多个业务品种、业务分类时，通过抽象工厂模式产生需要的对象是一种非常好的解决方式。可以用来生产不同产品族的全部产品。

### 建造者模式

```java
//产品角色,包含多个组成部件的复杂对象
class Product
{
    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String partA)
    {
        this.partA=partA;
    }
    public void setPartB(String partB)
    {
        this.partB=partB;
    }
    public void setPartC(String partC)
    {
        this.partC=partC;
    }
    public void show()
    {
        //显示产品的特性
    }
}
```

```java
//抽象建造者：包含创建产品各个子部件的抽象方法
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
```

```java
//具体建造者：实现了抽象建造者接口
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}

```

```java
//指挥者：调用建造者中的方法完成复杂对象的创建
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构造与组装方法
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}

```

```java
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
```

建造者模式创建复杂对象，产品的各个部分经常面临着剧烈的变化，但将它们组合在一起的算法却相对稳定，产品的构建过程和最终的表示是独立的。通过不同的方式实现抽象建造者接口，创造出不同的产品。

### 代理模式

```java
public interface Subject {
    void Request();
}//抽象主题
```

```java
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("访问真实主题方法");
    }
}//真实主题
```

```java
public class Proxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void Request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }
    public void preRequest(){
        System.out.println("访问真实主题之前的预处理。");
    }
    public void postRequest(){
        System.out.println("访问真实主题之后的后续处理。");
    }
}//代理
```

```java
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.Request();
    }
}
```

代理模式为其他对象提供一种代理以控制对这个对象的访问，在访问一个类时做一些控制，起到中介作用和保护目标对象的作用，并可以扩展目标对象的功能，在一定程度上降低了系统的耦合度。

### 适配器模式

- 类适配器模式

  ```java
  public interface Target {
      void request();
  }//目标接口
  ```

  ```java
  public class Adaptee {
      public void specificRequest(){
          System.out.println("适配器中的业务代码被调用");
      }
  }//适配器接口
  ```

  ```java
  public class ClassAdapter extends Adaptee implements Target {
      @Override
      public void request() {
          specificRequest();
      }
  }//类适配器类
  ```

  ```java
  public class ClassAdapterTest {
      public static void main(String[] args) {
          System.out.println("类适配器模式测试");
          Target target = new ClassAdapter();
          target.request();
      }
  }
  ```

- 对象适配器模式

  ```java
  public class ObjectAdapter implements Target {
      private Adaptee adaptee;
      public ObjectAdapter(Adaptee adaptee) {
          this.adaptee = adaptee;
      }
      @Override
      public void request() {
          adaptee.specificRequest();
      }
  }//对象适配器类
  ```

  ```java
  public class ObjectAdapterTest {
      public static void main(String[] args) {
          System.out.println("对象适配器模式测试");
          Adaptee adaptee = new Adaptee();
          Target target = new ObjectAdapter(adaptee);
          target.request();
      }
  }
  ```

  适配器模式适用于之前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致时，可以让两个没有关联的类一起运行，提高了类的复用。

### 桥接模式

```java
public interface Implementor {
    void OperationImpl();
}//实现化角色
```

```java
public class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化Concrete Implementor角色被访问");
    }
}//具体实现化角色
```

```java
public abstract class Abstraction {
    protected Implementor implementor;
    protected Abstraction(Implementor implementor){
        this.implementor = implementor;
    }
    public abstract void Operation();
}//抽象化角色
```

```java
public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化Refined Abstraction角色被访问");
        implementor.OperationImpl();
    }
}//扩展抽象化角色
```

```java
public class BridgeTest {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(implementor);
        abs.Operation();
    }
}
```

桥接模式适用于：

当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时。

当一个系统不希望使用继承或因为多层次继承导致系统类的个数急剧增加时。

当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的 灵活性时。

有时桥接模式可以与适配器模式联合使用。当桥接模式的实现化角色的接口与现有类的接口不一致时，可以在二者之间定义一个适配器将二者连接起来。

### 装饰模式

```java
public interface Component {
    void operation();
}//抽象构件角色
```

```java
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体构件角色的方法operation");
    }
}//具体构件角色
```

```java
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}//抽象装饰角色
```

```java
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void operation(){
        super.operation();
        addedFunction();
    }
    public void addedFunction(){
        System.out.println("为具体构件角色");
    }
}//具体装饰角色
```

```java
public class DecoratorTest {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("-----------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
```

装饰器模式使用场景：当需要给一个现有类添加附加职责，而又不能采用生成子类的方法进行扩充时。要求动态添加功能并可以动态撤销时。

### 外观模式

```java
public class SubSystem1 {
    public void method1(){
        System.out.println("子系统1的method1");
    }
}//子系统角色1
public class SubSystem2 {
    public void method2(){
        System.out.println("子系统2的method2");
    }
}//子系统角色2
public class SubSystem3 {
    public void method3(){
        System.out.println("子系统3的method3");
    }
}//子系统角色3
```

```java
public class Facade {
    private SubSystem1 obj1 = new SubSystem1();
    private SubSystem2 obj2 = new SubSystem2();
    private SubSystem3 obj3 = new SubSystem3();
    public void method(){
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}//外观角色
```

```java
public class FacadeTest {
    public static void main(String[] args) {
        Facade f = new Facade();
        f.method();
    }
}
```

外观模式为复杂的模块或子系统提供外界访问的接口，子系统相对独立。客户端不需要知道系统内部的复杂联系，整个系统只需要一个”接待员“即可。

### 享元模式

````java
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}//非享元角色
````

```java
public interface Flyweight {
    void operation(UnsharedConcreteFlyweight state);
}//抽象享元角色
```

```java
public class ConcreteFlyweight implements Flyweight {
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元"+key+"被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("具体享元"+key+"被调用");
        System.out.println("非享元信息是:"+state.getInfo());
    }
}//具体享元角色
```

```java
public class FlyweightFactory {
    private HashMap<String,Flyweight> flyweights = new HashMap<>();
    public Flyweight getFlyweight(String key){
        Flyweight flyweight = (Flyweight)flyweights.get(key);
        if(flyweight!=null){
            System.out.println("具体享元"+key+"已经存在，被成功获取");
        }else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key,flyweight);
        }
        return flyweight;
    }
}//享元工厂角色
```

````java
public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("a");
        Flyweight f02 = factory.getFlyweight("a");
        Flyweight f03 = factory.getFlyweight("a");
        Flyweight f11 = factory.getFlyweight("b");
        Flyweight f12 = factory.getFlyweight("b");
        f01.operation(new UnsharedConcreteFlyweight("第一次调用a"));
        f02.operation(new UnsharedConcreteFlyweight("第二次调用a"));
        f03.operation(new UnsharedConcreteFlyweight("第三次调用a"));
        f11.operation(new UnsharedConcreteFlyweight("第一次调用b"));
        f12.operation(new UnsharedConcreteFlyweight("第二次调用b"));
    }
}
````

享元模式通过共享已经存在的对象来大幅度减少需要创建的对象数量，避免大量相似类的开销，从而提高系统资源的利用率。相同对象只要保留一份，降低了系统中对象的数量。享元模式中有两种状态：内部状态，不会随着环境的改变而改变的可共享部分。外部状态，随环境改变的不可以共享的部分。

### 组合模式

```java
public interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}//抽象构件
```

```java
public class Leaf implements Component {
    private String name;
    public Leaf(String name) {
        this.name = name;
    }
    @Override
    public void add(Component c) {}
    @Override
    public void remove(Component c) {}
    @Override
    public Component getChild(int i) {
        return null;
    }
    @Override
    public void operation() {
        System.out.println("树叶"+name+"被访问");
    }
}//树叶构件
```

```java
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<>();
    @Override
    public void add(Component c) {
        children.add(c);
    }
    @Override
    public void remove(Component c) {
        children.remove(c);
    }
    @Override
    public Component getChild(int i) {
        return children.get(i);
    }
    @Override
    public void operation() {
        for(Component component : children){
            component.operation();
        }
    }
}//树枝构件
```

```java
public class CompositeTest {
    public static void main(String[] args) {
        Component c0 = new Composite();
        Component c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
```

组合模式是一种将对象组合成树状的层次结构的模式，用来表示"部分-整体"的关系，使用户对单个对象和组合对象具有一致的访问性，可以一致的处理单个对象和组合对象，简化了客户端代码。更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码。

### 模板方法模式

```java
public abstract class AbstractClass {
    public void TemplateMethod(){
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    public void SpecificMethod(){
        System.out.println("抽象类中的具体方法被调用");
    }
    public abstract void abstractMethod1();//抽象方法1
    public abstract void abstractMethod2();//抽象方法2
}//抽象类
```

```java
public class ConcreteClass extends AbstractClass{
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用");
    }
}//具体类
```

```java
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}
```

模板方法模式定义一个操作中的骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。

### 策略模式

```java
public interface Strategy {
    void strategyMethod();
}//抽象策略类
```

```java
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("策略A的策略方法被访问");
    }
}//具体策略类A
```

```java
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("策略B的策略方法被访问");
    }
}//具体策略类B
```

```java
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}//环境类
```

```java
public class StrategyTest {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
```

策略模式定义了一系列算法，并将每个算法封装起来，使它们可以互相替换，可以在不修改源代码的情况下，灵活增加新算法。

### 命令模式

```java
public interface Command {
    void execute();
}//抽象命令
```

```java
public class ConcreteCommand implements Command {
    private Receiver receiver;
    public ConcreteCommand() {
        this.receiver = new Receiver();
    }
    @Override
    public void execute() {
        receiver.action();
    }
}//具体命令
```

```java
public class Receiver {
    public void action(){
        System.out.println("接收者的action方法被调用");
    }
}//接收者
```

```java
public class Invoker {
    private Command command;
    public Invoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void call(){
        System.out.println("调用者执行命令command");
        command.execute();
    }
}//调用者
```

```java
public class CommandTest {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call方法");
        ir.call();
    }
}
```

命令模式将一个请求封装为一个对象，使发出请求的责任与执行请求的责任分隔开，将调用操作的对象与实现该操作的对象解耦。两者通过命令对象进行沟通，这样方便将命令对象进行储存，传递，调用，增加与管理。

### 责任链模式

```java
public abstract class Handler {
    private Handler next;
    public Handler getNext() {
        return next;
    }
    public void setNext(Handler next) {
        this.next = next;
    }
    //处理请求的方法
    public abstract void handleRequest(String request);
}//抽象处理者角色
```

```java
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if(request.equals("one")){
            System.out.println("具体处理者1负责处理该请求");
        }else{
            if(getNext()!=null){
                getNext().handleRequest(request);
            }else {
                System.out.println("没人处理该请求");
            }
        }
    }
}//具体处理者1
```

```java
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if(request.equals("two")){
            System.out.println("具体处理者2负责处理该请求");
        }else{
            if(getNext()!=null){
                getNext().handleRequest(request);
            }else {
                System.out.println("没人处理该请求");
            }
        }
    }
}//具体处理者2
```

```java
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
```

责任链模式，为了避免请求发送者与多个请求处理者耦合在一起，将所有请求的处理者通过前一对象记住下一个对象的引用而连成一条链。请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。如Servlet中的Filter等。主要应用于：有多个对象可以处理一个请求，哪个对象处理该请求由运行时刻决定。可以动态添加新的处理者。

### 状态模式

```java
public class Context {
    private State state;
    //定义环境类的初始状态
    public Context() {
        this.state = new ConcreteStateA();
    }
    //设置新状态
    public void setState(State state){
        this.state = state;
    }
    //读取状态
    public State getState(){
        return state;
    }
    //对请求做处理
    public void Handle(){
        state.Handle(this);
    }
}//环境类
```

```java
public abstract class State {
    public abstract void Handle(Context context);
}//抽象状态类
public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是A");
        context.setState(new ConcreteStateB());
    }
}//具体状态类A
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是B");
        context.setState(new ConcreteStateA());
    }
}//具体状态类B
```

```java
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();//创建环境
        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
```

软件开发过程中，应用程序中的有些对象可能会根据不同的情况做出不同的行为，我们把这种对象称为有状态的对象。状态模式把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。

### 观察者模式

```java
public interface Observer {
    void response();//反应
}//抽象观察者
```

```java
public class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者1做出反应");
    }
}//具体观察者1
```

```java
public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2做出反应");
    }
}//具体观察者2
```

```java
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();
    //增加观察者方法
    public void add(Observer observer){
        observers.add(observer);
    }
    //删除观察者方法
    public void remove(Observer observer){
        observers.remove(observer);
    }
    public abstract void notifyObserver();//通知观察者方法
}//抽象目标
```

```java
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变");
        System.out.println("--------------");
        for(Observer observer:observers){
            observer.response();
        }
    }
}//具体目标
```

```java
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}
```

观察者模式指多个对象存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。又称作发布-订阅模式。

### 中介者模式

```java
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague colleague);
}//抽象中介者
```

```java
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<>();
    public void register(Colleague colleague){
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }
    public void relay(Colleague cl){
        for(Colleague ob : colleagues){
            if(!ob.equals(cl)){
                ob.receive();
            }
        }
    }
}//具体中介者
```

```java
public abstract class Colleague {
    protected Mediator mediator;
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}//抽象同事类
```

```java
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求");
        mediator.relay(this);//请中介者转发
    }
}//具体同事类1
```

```java
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求");
        mediator.relay(this);//请中介者转发
    }
}//具体同事类2
```

```java
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
```

中介者模式通过定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，使对象间的一对多关联转变为一对一关联，将对象间的网状关系转变为星形关系。在实际开发中，通常采用以下方法简化中介者模式：不定义中介者接口，把具体中介者对象实现为单例。同事对象不持有中介者，而是在需要的时候直接获取中介者对象并调用。

### 迭代器模式

```java
public interface Aggregate {
    void add(Object object);
    void remove(Object object);
    Iterator getIterator();
}//抽象聚合
```

```java
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();
    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}//具体聚合
```

```java
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}//抽象迭代器
```

```java
public class ConcreteIterator implements Iterator {

    private List<Object> list;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object object = list.get(index);
        return object;
    }

    @Override
    public Object next() {
        Object object = null;
        if(this.hasNext()){
            object = list.get(++index);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        if(index<list.size()-1)
            return true;
        return false;
    }
}//具体迭代器
```

迭代器模式提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。

### 访问者模式

```java
public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}//抽象访问者
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->"+element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->"+element.operationB());
    }
}//具体访问者A
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->"+element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->"+element.operationB());
    }
}//具体访问者B
```

```java
public interface Element {
    void accept(Visitor visitor);
}//抽象元素
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationA(){
        return "具体元素A的操作";
    }
}//具体元素A
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationB(){
        return "具体元素B的操作";
    }
}//具体元素B
```

```java
public class ObjectStructure {
    private List<Element> list = new ArrayList<>();
    public void accept(Visitor visitor){
        Iterator<Element> i = list.iterator();
        while(i.hasNext()){
            i.next().accept(visitor);
        }
    }
    public void add(Element element){
        list.add(element);
    }
    public void remove(Element element){
        list.remove(element);
    }
}//对象结构
```

```java
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
```

访问者模式将作用于某种数据结构的各元素的操作分离出来封装成独立的类，使其在不改变数据结构的前提下可以添加作用于这些元素的新操作。适用于：对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作，避免让这些操作“污染”这些对象的类，在增加新操作时不修改这些类。

### 备忘录模式

```java
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}//备忘录
```

```java
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento m){
        this.setState(m.getState());
    }
}//发起人
```

```java
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}//管理者
```

```java
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
```

备忘录模式，在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便以后需要时将该对象恢复到原先保存的状态。

### 解释器模式

```java
public interface AbstractExpression {
    Object interpret(String info);//解释方法
}//抽象表达式类
public class TerminalExpression implements AbstractExpression{
    @Override
    public Object interpret(String info) {
        //对终结符表达式的处理
        return null;
    }
}//终结符表达式类
public class NonterminalExpression implements AbstractExpression {
    private AbstractExpression exp1;
    private AbstractExpression exp2;
    @Override
    public Object interpret(String info) {
        //对非终结符表达式的处理
        return null;
    }
}//非终结符表达式类
public class Context {
    private AbstractExpression exp;
    public Context(){
        //数据初始化
    }
    public void operation(String info){
        //调用相关表达式类的解释方法
    }
}//环境类
```

解释器模式：给分析对象定义一个语言，并定义该语言的文法表示，再设计一个解析器来解释语言中的句子。也就是说，用编译语言的方式来分析应用中的实例。这种模式实现了文法表达式处理的接口，该接口解释一个特定的上下文。
