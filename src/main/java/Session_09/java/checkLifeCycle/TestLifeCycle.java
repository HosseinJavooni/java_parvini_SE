package Session_09.java.checkLifeCycle;

public class TestLifeCycle {
    public static void main(String[] args) {
        System.out.println("new LifeCycle.m1();");
        new LifeCycle().m1();
        System.gc();
    }
}
