package Session_09.java.SingletonClass.ParviniCourseImpl;
//singleton Design Pattern
public final class God1_SingletonPattern1 { // Lazy
    // fields
    // method
    private God1_SingletonPattern1(){}
    private static God1_SingletonPattern1 instance = null;
    public static God1_SingletonPattern1 getInstance(){
        if (instance == null)
            instance = new God1_SingletonPattern1();
        return instance;
    }
}
