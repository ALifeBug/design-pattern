/**
 * Created by sccy on 2019/7/30/0030.
 */
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
}
