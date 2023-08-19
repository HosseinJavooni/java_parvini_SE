package Session_06.java;

import java.util.Scanner;

public class ChangeStringToStarsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String string = scanner.nextLine();
        replaceNonStarsCharacterWithStar(string);

    }
    //This manner absolutely is not the efficient way!!!
    private static void replaceNonStarsCharacterWithStar(String string) {
        System.out.println(string);
        String[] strings = string.split("");

        for(int character=0; character < strings.length; character++){
            if(!strings[character].equals("*"))
                strings[character] = "*";
            for(String s: strings){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
