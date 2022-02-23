package asymmetric.modular_arithmetic;


// todo: pollard's rho algorithm

public class App {
    public static void main(String[] args) {
        PrimeFactorization f = new PrimeFactorization();
        f.factor(672804137).forEach(e -> System.out.println("["+ e[0] + ", " + e[1] + "]"));
    }
}
