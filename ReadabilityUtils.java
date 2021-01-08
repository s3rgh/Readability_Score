package readability;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadabilityUtils {

    private static String path;

    public static String getPath() {
        return path;
    }

    public static void setPath(String path) {
        ReadabilityUtils.path = path;
    }

    public static void printInfo() {

        String text = readText(path);

        System.out.println("The text is:");
        System.out.println(text);
        System.out.println();
        System.out.println("Words: " + countOfWords(text));
        System.out.println("Sentences: " + countOfSentences(text));
        System.out.println("Characters: " + countOfCharacters(text));
        System.out.println("Syllables: " + countOfSyllables(text));
        System.out.println("Polysyllables: " + countOfPolysyllables(text));
    }

    /**
     * @param string is a path to a file with source text for analyze
     */
    public static String readText(String string) {

        try (FileInputStream fileInputStream = new FileInputStream(string);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))) {
            String temp;
            StringBuilder text = new StringBuilder();
            while ((temp = bufferedReader.readLine()) != null) {
                text.append(temp);
            }
            return text.toString();
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
        return "";
    }

    static long countOfSentences(String s) {
        return s.split("[!.?]").length;
    }

    static long countOfWords(String s) {
        //return s.split(".[0-9]+.[0-9]+\\s*|\\s").length;
        return s.split("[\\s*!.?]+").length;
    }

    static long countOfCharacters(String s) {
        long countOfCharacters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).matches("[\\w!#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]")) {
                countOfCharacters++;
            }
        }
        return countOfCharacters;
    }

    static long countOfSyllables(String s) {
        long countSyllables = 0;
        Pattern splitter = Pattern.compile("[bcdfghjklmnpqrstvwxz]*[aeiouy]+[bcdfghjklmnpqrstvwxz]*");
        Matcher m;
        String[] words = s.replaceAll("-", " ").toLowerCase().split("[\\s*!.?]+");
        for (String word : words) {
            long countSyllablesInWord = 0;
            m = splitter.matcher(word);
            while (m.find()) {
                countSyllablesInWord++;
            }
            if (word.charAt(word.length() - 1) == 'e') {
                countSyllablesInWord--;
            }
            if (countSyllablesInWord == 0) {
                countSyllablesInWord = 1;
            }
            //System.out.println(words[i] + " " + countSyllablesInWord);
            countSyllables = countSyllables + countSyllablesInWord;
        }
        return countSyllables;
    }

    static long countOfPolysyllables(String s) {
        long countPolySyllables = 0;
        Pattern splitter = Pattern.compile("[bcdfghjklmnpqrstvwxz]*[aeiouy]+[bcdfghjklmnpqrstvwxz]*");
        Matcher m;
        String[] words = s.replaceAll("-", " ").toLowerCase().split("[\\s*!.?]+");
        for (String word : words) {
            long countSyllablesInWord = 0;
            m = splitter.matcher(word);
            while (m.find()) {
                countSyllablesInWord++;
            }
            if (word.charAt(word.length() - 1) == 'e') {
                countSyllablesInWord--;
            }
            if (countSyllablesInWord > 2) {
                countPolySyllables++;
            }
        }
        return countPolySyllables;
    }
}
