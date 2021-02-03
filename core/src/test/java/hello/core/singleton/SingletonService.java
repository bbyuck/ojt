package hello.core.singleton;

public class SingletonService {

    // static 변수로 잡아 메모리상에서 static하게 유지하고, new 키워드는 private로 지정
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {}

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
