package readability;

public class Readability {

    ReadabilityStrategy readabilityStrategy;

    public void setReadabilityStrategy(ReadabilityStrategy readabilityStrategy) {
        this.readabilityStrategy = readabilityStrategy;
    }

    public void runTask(long words, long sentences, long characters, long syllables, long polysyllables) {
        this.readabilityStrategy.readabilityCount(words, sentences, characters, syllables, polysyllables);
    }
}