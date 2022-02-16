package symmetric.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetKey {
    private GetKey() {
    };

    private static List<Integer> numbersList;

    public static List<Integer> getKeyList(String plainText) {
        if (numbersList == null) {
            Random rand = new Random();
            numbersList = new ArrayList<>();
            int textLength = plainText.length();
            for (int i = 0; i < textLength; i++) {
                numbersList.add(rand.nextInt(textLength));
            }
        }
        return numbersList;
    }

    public static void destroyKeyList() {
        if (numbersList !=null) {
            numbersList = null;
        }
    }
}
