package symmetric.VigenereCipher;

import symmetric.Utils.ConfigurationReader;

public class VigenereEncode {
    static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String vigenereKey = ConfigurationReader.get("vigenereKey").toUpperCase();

    /**
     *
     * @param plainText the text to be encoded
     * @return cipherText the encoded text
     */
    public static String encode (String plainText) {
        // to unify the characters cases
        plainText = plainText.toUpperCase();

        StringBuilder cipherText = new StringBuilder();
        int currentKeyIndex = 0;
        for (char c: plainText.toCharArray()){
            int index = ALPHABET.indexOf(c);
            if (index >=0) {
                cipherText.append(ALPHABET.charAt((index + ALPHABET.indexOf(vigenereKey.charAt(currentKeyIndex)))%ALPHABET.length()));
               currentKeyIndex = (currentKeyIndex+1)% vigenereKey.length();
            } else {
                cipherText.append(c);
            }
        }
        return cipherText.toString();
    }
}
