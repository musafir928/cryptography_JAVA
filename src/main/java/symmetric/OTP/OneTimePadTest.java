package symmetric.OTP;

import symmetric.Utils.GetKey;

import java.util.List;

public class OneTimePadTest {
    public static void main(String[] args) {
        String plainText = "data encryption is very important!";
        List<Integer> keyList = GetKey.getKeyList(plainText);
        String encoded = OneTimePadEncrypt.encrypt(plainText.toUpperCase(), keyList);
        String decoded = OneTimePadDecrypt.decrypt(encoded, keyList);
        System.out.println("encoded = " + encoded);
        System.out.println("decoded = " + decoded);
        GetKey.destroyKeyList();
    }
}
