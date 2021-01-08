package readability;

public class AllReadabilitiesStrategy implements ReadabilityStrategy {
    @Override
    public void readabilityCount(long words, long sentences, long characters, long syllables, long polysyllables) {
        double scoreARI = 4.71 * (double) characters / words + 0.5 * (double) words / sentences - 21.43;
        int ageARI = 0;
        switch ((int) Math.round(scoreARI)) {
            case 1:
                ageARI = 6;
                break;
            case 2:
                ageARI = 7;
                break;
            case 3:
                ageARI = 9;
                break;
            case 4:
                ageARI = 10;
                break;
            case 5:
                ageARI = 11;
                break;
            case 6:
                ageARI = 12;
                break;
            case 7:
                ageARI = 13;
                break;
            case 8:
                ageARI = 14;
                break;
            case 9:
                ageARI = 15;
                break;
            case 10:
                ageARI = 16;
                break;
            case 11:
                ageARI = 17;
                break;
            case 12:
                ageARI = 18;
                break;
            case 13:
                ageARI = 24;
                break;
            case 14:
                ageARI = 25;
                break;
            default:
        }
        System.out.printf("Automated Readability Index: %.2f (about %d year olds).%n", scoreARI, ageARI);

        double scoreFK = 0.39 * (double) words / sentences + 11.8 * (double) syllables / words - 15.59;
        int ageFK = 0;
        switch ((int) Math.round(scoreFK)) {
            case 1:
                ageFK = 6;
                break;
            case 2:
                ageFK = 7;
                break;
            case 3:
                ageFK = 9;
                break;
            case 4:
                ageFK = 10;
                break;
            case 5:
                ageFK = 11;
                break;
            case 6:
                ageFK = 12;
                break;
            case 7:
                ageFK = 13;
                break;
            case 8:
                ageFK = 14;
                break;
            case 9:
                ageFK = 15;
                break;
            case 10:
                ageFK = 16;
                break;
            case 11:
                ageFK = 17;
                break;
            case 12:
                ageFK = 18;
                break;
            case 13:
                ageFK = 24;
                break;
            case 14:
                ageFK = 25;
                break;
            default:
        }
        System.out.printf("Flesch–Kincaid readability tests: %.2f (about %d year olds).%n", scoreFK, ageFK);

        double scoreSMOG = 1.043 * Math.sqrt((double) polysyllables * 30 / sentences) + 3.1291;
        int ageSMOG = 0;
        switch ((int) Math.round(scoreSMOG)) {
            case 1:
                ageSMOG = 6;
                break;
            case 2:
                ageSMOG = 7;
                break;
            case 3:
                ageSMOG = 9;
                break;
            case 4:
                ageSMOG = 10;
                break;
            case 5:
                ageSMOG = 11;
                break;
            case 6:
                ageSMOG = 12;
                break;
            case 7:
                ageSMOG = 13;
                break;
            case 8:
                ageSMOG = 14;
                break;
            case 9:
                ageSMOG = 15;
                break;
            case 10:
                ageSMOG = 16;
                break;
            case 11:
                ageSMOG = 17;
                break;
            case 12:
                ageSMOG = 18;
                break;
            case 13:
                ageSMOG = 24;
                break;
            case 14:
                ageSMOG = 25;
                break;
            default:
        }
        System.out.printf("Simple Measure of Gobbledygook: %.2f (about %d year olds).%n", scoreSMOG, ageSMOG);

        double averageSentences = (double) sentences / words * 100;
        double averageLetters = (double) characters / words * 100;
        double scoreCL = 0.0588 * averageLetters - 0.296 * averageSentences - 15.8;
        int ageCL = 0;
        switch ((int) Math.round(scoreCL)) {
            case 1:
                ageCL = 6;
                break;
            case 2:
                ageCL = 7;
                break;
            case 3:
                ageCL = 9;
                break;
            case 4:
                ageCL = 10;
                break;
            case 5:
                ageCL = 11;
                break;
            case 6:
                ageCL = 12;
                break;
            case 7:
                ageCL = 13;
                break;
            case 8:
                ageCL = 14;
                break;
            case 9:
                ageCL = 15;
                break;
            case 10:
                ageCL = 16;
                break;
            case 11:
                ageCL = 17;
                break;
            case 12:
                ageCL = 18;
                break;
            case 13:
                ageCL = 24;
                break;
            case 14:
                ageCL = 25;
                break;
            default:
        }
        System.out.printf("Coleman–Liau index: %.2f (about %d year olds).%n", scoreCL, ageCL);
        double avgAge = (double) (ageARI + ageCL + ageSMOG + ageFK) / 4;
        System.out.printf("%nThis text should be understood in average by %.2f year olds.%n", avgAge);
    }
}