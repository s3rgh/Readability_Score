package readability;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream(args[0]);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))) {
            String temp;
            StringBuilder text = new StringBuilder();
            while ((temp = bufferedReader.readLine()) != null) {
                text.append(temp);
            }
            long countOfSentences = text.toString().split("[!.?]").length;
            long countOfWords = text.toString().split("\\s").length;
            long countOfCharacters = 0;

            for (int i = 0; i < text.length(); i++) {
                if (Character.toString(text.charAt(i)).matches("[\\w!#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]")) {
                    countOfCharacters++;
                }
            }
            System.out.println("The text is:");
            System.out.println(text.toString());
            System.out.println();
            System.out.println("Words: " + countOfWords);
            System.out.println("Sentences: " + countOfSentences);
            System.out.println("Characters: " + countOfCharacters);

            double score = 4.71 * (double) countOfCharacters / countOfWords + 0.5 * (double) countOfWords / countOfSentences - 21.43;
            System.out.printf("The score is: %.2f%n", score);
            switch ((int) Math.ceil(score)) {
                case 1:
                    System.out.println("This text should be understood by 5-6 year olds.");
                    break;
                case 2:
                    System.out.println("This text should be understood by 6-7 year olds.");
                    break;
                case 3:
                    System.out.println("This text should be understood by 7-9 year olds.");
                    break;
                case 4:
                    System.out.println("This text should be understood by 9-10 year olds.");
                    break;
                case 5:
                    System.out.println("This text should be understood by 10-11 year olds.");
                    break;
                case 6:
                    System.out.println("This text should be understood by 11-12 year olds.");
                    break;
                case 7:
                    System.out.println("This text should be understood by 12-13 year olds.");
                    break;
                case 8:
                    System.out.println("This text should be understood by 13-14 year olds.");
                    break;
                case 9:
                    System.out.println("This text should be understood by 14-15 year olds.");
                    break;
                case 10:
                    System.out.println("This text should be understood by 15-16 year olds.");
                    break;
                case 11:
                    System.out.println("This text should be understood by 16-27 year olds.");
                    break;
                case 12:
                    System.out.println("This text should be understood by 17-18 year olds.");
                    break;
                case 13:
                    System.out.println("This text should be understood by 18-24 year olds.");
                    break;
                case 14:
                    System.out.println("This text should be understood by 24+ year olds.");
                    break;
                default:
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}