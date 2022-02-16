package symmetric.OTP;

import symmetric.Utils.ConfigurationReader;
import symmetric.Utils.GetKey;

import java.util.List;

public class OneTimePadEncrypt {
    static String alphabet = " " + ConfigurationReader.get("ALPHABET");

    public static String encrypt(String plainText, List<Integer> numbersList) {
        StringBuilder cipherText = new StringBuilder();
        int currentKeyIndex = 0;
        for (char c : plainText.toCharArray()) {
            int charIndex = alphabet.indexOf(c);
            if (charIndex != -1) {
                cipherText.append(alphabet.charAt((charIndex + numbersList.get(currentKeyIndex)) % alphabet.length()));
            } else {
                cipherText.append(".");
            }
            currentKeyIndex++;
        }
        return cipherText.toString().toString();
    }
}
