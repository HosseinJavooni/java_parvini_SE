package Session_05.java;

import org.openjdk.jol.vm.VM;

public class StringStringBufferStringBuilder {

    public static void main(String[] args){
        String s = "Hossein";
        System.out.println(VM.current().addressOf(s));
        s = s + " Javooni";
        System.out.println(VM.current().addressOf(s));

        StringBuffer sb = new StringBuffer("Hossien");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }

}
