package readability;

public class AllReadabilities extends Readability {

    public AllReadabilities() {
        this.readabilityStrategy = new AllReadabilitiesStrategy();
    }
}