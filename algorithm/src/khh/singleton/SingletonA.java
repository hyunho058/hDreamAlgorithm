package khh.singleton;


/**
 * 멀티스레드에서 세이프하지 않음
 *
 * @author hyunho
 * @since 2021/10/20
**/
public class SingletonA {

    private static SingletonA instance;

    private SingletonA(){}

    //스레드 A,B가 존재할때 getInstance() 에 접근시 A가 if 문을 통과해 instance를 생성하는중
    // B가 if 문에 들어오면 instance가 생성되지 않아 B도 조건에 통과되어 instance 를 생겅하게 된다.
    public static SingletonA getInstance(){

        if (instance == null){
            instance = new SingletonA();
        }
        return instance;
    }


}
