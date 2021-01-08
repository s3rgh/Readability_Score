package readability;

import java.util.Scanner;

import static readability.ReadabilityUtils.*;

public class Main {
    public static void main(String[] args) {

        Readability readability = new Readability();
        ReadabilityUtils.setPath(args[0]);
        String text = readText(getPath());
        long words = countOfWords(text);
        long sentences = countOfSentences(text);
        long characters = countOfCharacters(text);
        long syllables = countOfSyllables(text);
        long polysyllables = countOfPolysyllables(text);
        printInfo();

        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        System.out.println();
        switch (temp) {
            case "ARI":
                readability.setReadabilityStrategy(new AutomatedReadabilityStrategy());
                readability.runTask(words, sentences, characters, syllables, polysyllables);
                break;
            case "FK":
                readability.setReadabilityStrategy(new FleschKincaidReadabilityStrategy());
                readability.runTask(words, sentences, characters, syllables, polysyllables);
                break;
            case "SMOG":
                readability.setReadabilityStrategy(new SimpleMeasureOfGobbledygookStrategy());
                readability.runTask(words, sentences, characters, syllables, polysyllables);
                break;
            case "CL":
                readability.setReadabilityStrategy(new ColemanLiauStrategy());
                readability.runTask(words, sentences, characters, syllables, polysyllables);
                break;
            case "all":
                readability.setReadabilityStrategy(new AllReadabilitiesStrategy());
                readability.runTask(words, sentences, characters, syllables, polysyllables);
                break;
            default:
        }
    }
}