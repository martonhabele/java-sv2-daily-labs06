package day04.hangman;

import java.util.Scanner;

public class HangmanMain {
    String wordToFind = "alma";
    String wordFound = "_".repeat(wordToFind.length());
    int chances = 8;

        public static void main(String[] args) {
            new HangmanMain().run();
        }

        private void run() {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Itt tartasz: " + wordFound);
                System.out.println("Ennyi tipped van: " + chances);
                System.out.println("Mi a következő tipped?");
                String guess = scanner.nextLine();

                if (wordToFind.contains(guess)) {
                    System.out.println("Jó tipp!");
                    wordFound = updateWordFound(wordToFind, wordFound, guess);
                }
                else {
                    System.out.println("Nem jó tipp!");
                    chances--;
                }
            } while (!wordFound.equals(wordToFind) && chances > 0);

            if (wordFound.equals(wordToFind)) {
                System.out.println(wordFound);
                System.out.println("Nyertél!");
                }
            else System.out.println("Vesztettél!");
        }

        private String updateWordFound(String wordToFind, String status, String guess) {
            char[] chars = status.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (wordToFind.charAt(i) == guess.charAt(0)) {
                    chars[i] = guess.charAt(0);
                }
            }
            return new String(chars);
        }
}