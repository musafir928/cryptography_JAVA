package symmetric.OTP;

import symmetric.Utils.ConfigurationReader;

import java.util.List;

public class OneTimePadDecrypt {
    static String alphabet = " " + ConfigurationReader.get("ALPHABET");

    public static String decrypt(String cipherText, List<Integer> numbersList) {
        StringBuilder plainText = new StringBuilder();
        int currentKeyIndex = 0;
        for (char c : cipherText.toCharArray()) {
            int charIndex = alphabet.indexOf(c);
            if (charIndex != -1) {
                plainText.append(alphabet.charAt((charIndex + alphabet.length() + - numbersList.get(currentKeyIndex)) % alphabet.length()));
            } else {
                plainText.append(".");
            }
            currentKeyIndex++;
        }
        return plainText.toString().toString();
    }
}
