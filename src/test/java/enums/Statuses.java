package enums;

public enum Statuses {

    OK(200),
    NOT_FOUND(404),
    CREATED(201);

    private final int value;

    private Statuses(int value) {
        this.value = value;
    }
    public int toInt() {
        return (int) value;
    }

}
