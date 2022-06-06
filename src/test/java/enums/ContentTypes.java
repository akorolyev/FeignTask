package enums;

public enum ContentTypes {
    JSON("[application/json; charset=utf-8]");

    private final String text;

    ContentTypes(final String text) {

        this.text = text;
    }
    public String toString() {
        return text;
    }

}
