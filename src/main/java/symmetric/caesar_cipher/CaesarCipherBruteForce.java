package symmetric.caesar_cipher;

import symmetric.caesar_cipher.CaesarCipher;

public class CaesarCipherBruteForce {
    public static String testCipher = "LIPPSDXSDGVCTXSDASVPH!";

    public static void main(String[] args) {
        crack(testCipher);
    }

    public static void crack(String cipher) {
        for (int i = 0; i < CaesarCipher.ALPHABET.length(); i++) {
            System.out.println("the result for key " + i
                    + " is: " + CaesarCipher.caesarCrypto(cipher, "de", i));
        }
    }
}

// the result is:
// the result for key 4 is: HELLO TO CRYPTO WORLD!
// this solution will work for caesar cipher, because limitation of the key value range
