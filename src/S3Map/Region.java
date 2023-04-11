package S3Map;

public enum Region {

    FRANCE("+33"),
    SUISSE("+44"),
    POLYNESIE("+689"),
    MARTINIQUE("+596"),
    INDONESIE("+62");

    public final String label;
    private Region(String label) {
        this.label = label;
    }

}
