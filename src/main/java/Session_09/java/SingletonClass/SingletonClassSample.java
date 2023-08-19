package Session_09.java.SingletonClass;

public class SingletonClassSample {
    private static SingletonClassSample singletonClassSample;
    private SingletonClassSample(){}

    public static SingletonClassSample returnSingletonClass(){
       return singletonClassSample == null ? singletonClassSample = new SingletonClassSample() : singletonClassSample;
    }

    public void printClass(){
        System.out.println(singletonClassSample.toString());
    }
}
