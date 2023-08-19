package Session_04;

import org.openjdk.jol.vm.VM;

public class Session04 {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 12;
        System.out.println(
          "VM.current().addressOf(a) --> " +      VM.current().addressOf(a) +
          "\n" +
          "a.hashCode()  -->  "    + a.hashCode());
        System.out.println(
                "VM.current().addressOf(b) --> " +      VM.current().addressOf(b) +
                        "\n" +
                        "b.hashCode()  -->  "    + b.hashCode());
        a = 11;
        System.out.println("a = 11");
        System.out.println(
                "VM.current().addressOf(a) --> " +      VM.current().addressOf(a) +
                        "\n" +
                        "a.hashCode()  -->  "    + a.hashCode());
        System.out.println(
                "VM.current().addressOf(b) --> " +      VM.current().addressOf(b) +
                        "\n" +
                        "b.hashCode()  -->  "    + b.hashCode());


    }
}
