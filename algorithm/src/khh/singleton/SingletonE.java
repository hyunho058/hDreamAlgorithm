package khh.singleton;

/**
 * static inner 클래스 사용
 *
 * @author hyunho
 * @since 2021/10/20
**/
public class SingletonE {
    private SingletonE(){}

    //멀티스레드 환경에서도 안전하고 getInstance(0호출시 INSTANCE를 만들기 때문에 lazy로딩이 가능하다.
    private static class SingletonHolder{
        private static final SingletonE INSTANCE = new SingletonE();
    }

    public static SingletonE getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
