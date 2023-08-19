package Session_04;

public class HeapReports {
    public static void main(String[] args) throws Throwable{
        Runtime runtime = Runtime.getRuntime();

        System.out.println("runtime.availableProcessors() -> " + runtime.availableProcessors());
        System.out.println("runtime.maxMemory() -> " + runtime.maxMemory());
        System.out.println("runtime.totalMemory() -> " + runtime.totalMemory());
        System.out.println("runtime.freeMemory() -> " + runtime.freeMemory());
        System.out.println("used memory -> " + (runtime.totalMemory() - runtime.freeMemory()));

        Variables_LocalAndGlobal variablesLocalAndGlobal = new Variables_LocalAndGlobal();
        variablesLocalAndGlobal = null;
        System.gc();
//        variablesLocalAndGlobal.finalize();


    }
}
