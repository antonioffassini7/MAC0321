package Exercicio1;

public class FatorialController {
    public static long calcFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número precisa ser não negativo.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
