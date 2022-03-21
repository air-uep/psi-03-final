package pl.air.letter;

import java.text.Collator;
import java.util.*;

public class Application1 {

    public static void main(String[] args) {
        String text =
                "Młodości! ty nad poziomy " +
                "Wylatuj, a okiem słońca " +
                "Ludzkości całe ogromy " +
                "Przeniknij z końca do końca!";
        Set<String> letters = new HashSet<>();
        // Set<String> letters = new TreeSet<>(Collator.getInstance());

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (! Character.isLetter(ch)) {
                continue;
            }
            String l = String.valueOf(ch);
            letters.add(l);
        }

        System.out.println(letters);
    }

}
