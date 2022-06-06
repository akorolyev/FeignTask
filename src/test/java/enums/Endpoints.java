package enums;

public enum Endpoints {
    GET_ALL_POSTS("posts"),
    GET_POST("posts/"),
    GET_ALL_USERS("users"),
    GET_USER("users/");

    private final String text;

    Endpoints(final String text) {
        this.text = text;
    }
    public String toString() {
        return text;
    }

}
