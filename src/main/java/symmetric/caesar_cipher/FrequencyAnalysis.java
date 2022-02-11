package symmetric.caesar_cipher;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FrequencyAnalysis {

    public static String testCipher = "WKLVCLVCWKHCEHJLQQLQJCRICDCVHFUHWC RUOGC KHUHCILQGLQJCRXWCLVCDO DBVCFRQVLGHUHGCDQCLPSRVVLEOHCWDVN,CEXWCVXFFHVVCLVC KHUHCWKHCWUXWKCOLHV!";

    public static void main(String[] args) {
        showFrequencies(testCipher);
    }

    private static Map<Character, Integer> run(String text) {
        text = text.toUpperCase();
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char c : CaesarCipher.ALPHABET.toCharArray()) {
            frequencies.put(c, 0);
        }
        for (char c: text.toCharArray()) {
            if (CaesarCipher.ALPHABET.indexOf(c) != -1) {
                frequencies.put(c, frequencies.get(c)+1);
            }
        }
        return frequencies;
    }

    public static void showFrequencies(String text) {
        Map<Character, Integer> frequencies = run(text);
        frequencies.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(e->CaesarCipher.ALPHABET.indexOf(e.getKey()))
                .forEach(System.out::println);
    }

}
