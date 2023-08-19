package Session_04;

public class Variables_LocalAndGlobal {
    int globalVariable = 3; //This variable seve on Heap area of memeory

    public void method(){
        int localVariable = 5; //This variable save on stack memory.
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("This is finalize override!");
        super.finalize();
    }
}
