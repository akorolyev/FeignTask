package enums;

public enum Paths {
    RESOURCE("src/test/resources/");

    private final String text;

    Paths(final String text) {
        this.text = text;
    }
    public String toString() {
        return text;
    }

}
