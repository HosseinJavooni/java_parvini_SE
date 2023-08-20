package Session_09.java.SingletonClass.myExperience;

public final class SingletonClassSample {
    private String name;
    private static SingletonClassSample singletonClassSample;

    private SingletonClassSample(String name) {
        this.name = name;
    }

    public static SingletonClassSample createAndreturnUniqueObject(String name) {
        return singletonClassSample == null ? singletonClassSample = new SingletonClassSample(name) : singletonClassSample;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
