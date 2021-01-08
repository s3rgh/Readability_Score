package readability;

public class ColemanLiau extends Readability {

    public ColemanLiau() {
        this.readabilityStrategy = new ColemanLiauStrategy();
    }
}