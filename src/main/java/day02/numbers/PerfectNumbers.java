package day02.numbers;

public class PerfectNumbers {
    boolean isPerfectNumber(int number) {
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors += i;
            }
        }
        return sumOfFactors == number;
    }
}