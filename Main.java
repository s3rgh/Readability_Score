package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() > 100) {
            System.out.println("HARD");
        } else {
            System.out.print("EASY");
        }
    }
}
