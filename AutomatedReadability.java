package readability;

public class AutomatedReadability extends Readability {

    public AutomatedReadability() {
        this.readabilityStrategy = new AutomatedReadabilityStrategy();
    }
}
