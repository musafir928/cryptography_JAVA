package asymmetric.modular_arithmetic;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public List<int[]> factor(int num) {
        int limit = (int) Math.floor(Math.sqrt(num));

        List<int[]> factors = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                factors.add(new int[]{i, num/i});
            }
        }

        return factors;
    }
}
