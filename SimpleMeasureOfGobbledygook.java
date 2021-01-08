package readability;

public class SimpleMeasureOfGobbledygook extends Readability {

    public SimpleMeasureOfGobbledygook() {
        this.readabilityStrategy = new SimpleMeasureOfGobbledygookStrategy();
    }
}