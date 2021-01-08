package readability;

import java.util.Map;

public interface ReadabilityStrategy {
    void readabilityCount(long words, long sentences, long characters, long syllables, long polysyllables);
}
