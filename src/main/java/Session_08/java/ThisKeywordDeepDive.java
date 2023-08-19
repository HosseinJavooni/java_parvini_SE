package Session_08.java;

public class ThisKeywordDeepDive {
    int i;
    { //Initialization Block (This block execute before any constructor execute)
        System.out.println("Initialization Code Block 1!");
    }
    public ThisKeywordDeepDive(int i){
        i = i; //in this situation i is in stack memory and with this statement it copies on itselft in stack
        this.i = i;// when we use "this" keyword java takes the i value form stack and copy it on object of
                   // class in heap memory.
        setI(34);
        System.out.println("Constructor sets in variable i --> " + i);
    }
    { //Initialization Block (This block execute before any constructor execute)
        System.out.println("Initialization Code Block 2! (Writhen after constructor ");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args){
        ThisKeywordDeepDive deepDive = new ThisKeywordDeepDive(23);
    }


}
