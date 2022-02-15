package symmetric.VigenereCipher;

import symmetric.Utils.ConfigurationReader;

public class VigenereDecode {
        static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        static String vigenereKey = ConfigurationReader.get("vigenereKey").toUpperCase();

        /**
         *
         * @param cipherText the text to be encoded
         * @return plainText the encoded text
         */
        public static String decode (String cipherText) {
            // to unify the characters cases
            cipherText = cipherText.toUpperCase();

            StringBuilder plainText = new StringBuilder();
            int currentKeyIndex = 0;
            for (char c: cipherText.toCharArray()){
                int index = ALPHABET.indexOf(c);
                if (index >=0) {
                    plainText.append(ALPHABET.charAt((index + ALPHABET.length() - ALPHABET.indexOf(vigenereKey.charAt(currentKeyIndex)))%ALPHABET.length()));
                    currentKeyIndex = (currentKeyIndex+1)% vigenereKey.length();
                } else {
                    plainText.append(c);
                }
            }
            return plainText.toString();
        }
    }
