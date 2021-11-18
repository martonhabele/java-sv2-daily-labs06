package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();
        Scanner scanner = new Scanner(System.in);

        double currentNumber = scanner.nextDouble();
        while (currentNumber > 0) {
            positiveNumberContainer.addNumber(currentNumber);
            currentNumber = scanner.nextDouble();
        }
        System.out.println(positiveNumberContainer.getNumbers());
    }
}