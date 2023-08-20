package Session_09.java.SingletonClass.myExperience;

public class TestOfSingletonClass {
    public static void main(String[] args) {
        SingletonClassSample s1 = SingletonClassSample.createAndreturnUniqueObject("test");
        System.out.println(s1);
        System.out.println("s1 name is:  " + s1.getName());
        s1.setName("Gholi");
        SingletonClassSample s2 = SingletonClassSample.createAndreturnUniqueObject("test");
        System.out.println(s2);
        System.out.println("s2 name is:  " + s2.getName());
    }
}
