package Session_05.java;

public class variableArguments_arity {
    public static void main(String[] args){
        showSome();
        showSome("a");
        showSome("a", "b", "c");
    }

    private static void showSome(String ... chars) {

        for(int item=0; item < chars.length; item++){
            System.out.print(chars[item] + ", ");
        }
        System.out.println();
    }
}
