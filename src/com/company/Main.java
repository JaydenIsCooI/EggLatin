package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Egg Latin Translator" + "\n------------------------------" + "\nInput: ");
        String s = in.nextLine();
        String egg = ("");

        for (int i = 0; i < s.length(); i++) {

            if     (s.charAt(i) == 'A' || s.charAt(i) == 'a' ||
                    s.charAt(i) == 'E' || s.charAt(i) == 'e' ||
                    s.charAt(i) == 'I' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'O' || s.charAt(i) == 'o' ||
                    s.charAt(i) == 'U' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'Y' || s.charAt(i) == 'y') {

                egg = egg + "egg" + s.charAt( i );
            }

            else {

                egg = egg + s.charAt( i );
            }
        }

        System.out.println("------------------------------" + "\nOutput: " + egg);

    }
}
