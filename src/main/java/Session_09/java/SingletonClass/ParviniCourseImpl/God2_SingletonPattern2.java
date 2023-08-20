package Session_09.java.SingletonClass.ParviniCourseImpl;

public final class God2_SingletonPattern2 { // Eager
    // fields
    // methods
    private God2_SingletonPattern2(){}
    private final static God2_SingletonPattern2 instance = new God2_SingletonPattern2();
    public static God2_SingletonPattern2 getInstance() {return instance;}
}
