package readability;

public class FleschKincaidReadability extends Readability {

    public FleschKincaidReadability() {
        this.readabilityStrategy = new FleschKincaidReadabilityStrategy();
    }

}