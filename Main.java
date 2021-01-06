package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int countOfSentence = str.split("[!.?]").length;
        int countOfWords = str.split(" ").length;
        if ((double) countOfWords / countOfSentence > 10) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
