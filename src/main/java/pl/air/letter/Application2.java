package pl.air.letter;

import java.util.*;

public class Application2 {

    public static void main(String[] args) {
        String text =
                "Młodości! ty nad poziomy " +
                "Wylatuj, a okiem słońca " +
                "Ludzkości całe ogromy " +
                "Przeniknij z końca do końca!";
        Map<String, Integer> letters = new HashMap<>();
        // Map<String, Integer> letters = new TreeMap<>(Collator.getInstance());

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (! Character.isLetter(ch)) {
                continue;
            }
            String l = String.valueOf(ch);

            Integer count = letters.get(l);
            if (count == null) {
                letters.put(l, 1);
            }
            else {
                count++;
                letters.put(l, count);
            }
        }

        System.out.println(letters);
    }

}
