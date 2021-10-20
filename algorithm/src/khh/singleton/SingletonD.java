package khh.singleton;

/**
 * double checked locking
 *  JDK 1.5 이상부터 사용 가능
 * @author hyunho
 * @since 2021/10/20
**/
public class SingletonD {

    private static volatile SingletonD instance;

    private SingletonD(){}

    //getInstance()를 호출할때마다 매번 synchronized를 실행하지 않는다는 장접이 있다.
    //멀티스레드가 빈번하게 일어나는 경우 if문안에 여러 스레드가 들어오게 되는대 이 경우 동시에
    // 들어온 스레드들만 synchronized를 실해앟고 이후에 스레드들은 synchronized를 실행하지 않고 해당 매서드를 사용할 수 있다.
    public static SingletonD getInstance(){
        if (instance == null){
            synchronized (SingletonD.class){
                if (instance == null){
                    instance = new SingletonD();
                }
            }
        }
        return instance;
    }
}
