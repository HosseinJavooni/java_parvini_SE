package Session_09.java.SingletonClass;

public class TestOfSingletonClass {
    public static void main(String[] args) {
        SingletonClassSample s1 = SingletonClassSample.returnSingletonClass();
        System.out.println(s1);
        SingletonClassSample s2 = SingletonClassSample.returnSingletonClass();
        System.out.println(s2);
    }
}
