package khh.singleton;

/**
 * sychronized 키워드를 사용해서 멀티스레드 문제 해결
 *
 * @author hyunho
 * @since 2021/10/20
**/
public class SingletonB {
    private static SingletonB instance;

    private SingletonB(){}

    //sychronized 키워드를 사용해서 매서드에 한번에 하나에 스레드만 들어오게 한다. - 여러게의 스레드가 들어올 수 없음
    //getInstance()를 호출할때마다 동기화 처리과정에서 성능에 좋지 않다
    //  - 동기화 가 lock를 사용해서 lock를 가지고 있는 스레드만 접근하고 작없이 마무리되면 다음 스레드가 lock를 소유하고 접근하고를 반복한다.
    public static synchronized SingletonB getInstance(){
        if (instance == null){
            instance = new SingletonB();
        }
        return instance;
    }
}
