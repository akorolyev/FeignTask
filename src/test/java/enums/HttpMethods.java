package enums;

public enum HttpMethods {
    GET("GET /"),
    POST("POST /");

    private final String text;

    HttpMethods(final String text) {
        this.text = text;
    }
    public String toString() {
        return text;
    }

}
