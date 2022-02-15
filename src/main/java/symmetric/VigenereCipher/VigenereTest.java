package symmetric.VigenereCipher;

public class VigenereTest {
    public static void main(String[] args) {
        String plainText = "people always think about things as an outsider";
        String encoded =  VigenereEncode.encode(plainText);
        String decoded = VigenereDecode.decode(encoded);

        System.out.println("plainText = " + plainText);
        System.out.println("encoded = " + encoded);
        System.out.println("decoded = " + decoded);
    }
}
