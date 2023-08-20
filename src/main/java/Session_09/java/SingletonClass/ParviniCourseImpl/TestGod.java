package Session_09.java.SingletonClass.ParviniCourseImpl;

public class TestGod {
    public static void main(String[] args) {
        God1_SingletonPattern1 g1 = God1_SingletonPattern1.getInstance();
        God1_SingletonPattern1 g2 = God1_SingletonPattern1.getInstance();

        if(g1 == g2) System.out.println("the same god");
        else System.out.println("2 gods!!!");

        God2_SingletonPattern2 g3 = God2_SingletonPattern2.getInstance();
        God3_SingletonPattern3 g4 = God3_SingletonPattern3.INSTANCE;
    }
}
