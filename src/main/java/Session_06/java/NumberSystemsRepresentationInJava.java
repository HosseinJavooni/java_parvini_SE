package Session_06.java;

public class NumberSystemsRepresentationInJava {
    public static void main(String[] args){
        //Decimal
        int intDecimal = 10;
        long longDecimal = 10L;
        System.out.println("int intDecimal = 10 --> " + intDecimal);
        System.out.println("long longDecimal = 10L --> " + longDecimal + "\n");

        //Hexadecimal
        int intHexadecimal = 0x12;
        long longHexadecimal = 0X12;
        System.out.println("int intHexadecimal = 0x12 --> " + intHexadecimal);
        System.out.println("long longHexadecimal = 0X12 --> " + longHexadecimal + "\n");

        //Octal
        int intOctal = 013;
        long longOctal = 013;
        System.out.println("int intOctal = 013 --> " + intOctal);
        System.out.println("long longOctal = 013 --> " + longOctal + "\n");

        //binary
        int intBinary = 0b1010;
        long longBinary = 0b1011;
        System.out.println("int intBinary = 0b1010 --> " + intBinary);
        System.out.println("long longBinary = 0b1011 --> " + longBinary + "\n");

    }
}
