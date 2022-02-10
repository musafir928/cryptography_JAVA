package symmetric;

import java.util.Locale;
import java.util.Objects;

public class CaesarCipher {
    static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final int KEY = 100;


    public static void main(String[] args) {
        System.out.println(caesarCryption(caesarCryption("men bir uyghur!!", "en"), "de"));
    }


    public static String caesarCryption(String text, String target) {

        StringBuilder result = new StringBuilder();
        int localKey = KEY%26;
        if (Objects.equals(target, "de")) {
            localKey = 26-localKey;
        }
        System.out.println("localKey = " + localKey);
        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = ALPHABET.indexOf(c);
            result.append(index == -1 ? c : ALPHABET.charAt((index + localKey) % 26));
        }

        return result.toString();
    }
}
