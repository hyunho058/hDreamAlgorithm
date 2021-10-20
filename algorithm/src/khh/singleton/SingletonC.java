package khh.singleton;

//이른 초기화(eager initialization) 방법
//스레드 세이프한 방법
//에플리케이션 로딩시 미리 생성 - 미리 만들기 때문에 단점이 될수 있다(만들었는대 쓰지 않으면 리소스를 허비하게 된다.)
public class SingletonC {

    private static final SingletonC INSTANCE = new SingletonC();

    private SingletonC(){}

    public static SingletonC getInstance(){
        return INSTANCE;
    }
}
