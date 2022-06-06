package enums;

public enum FileNames {
    CONFIG("config.properties"),
    DATA("data.properties");

    private final String text;

    FileNames(final String text) {
        this.text = text;
    }
    public String toString() {
        return text;
    }

}
