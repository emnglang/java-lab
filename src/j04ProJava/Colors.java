package j04ProJava;

public enum Colors {
    RED("#ff0000"),
    BLUE("#3366cc"),
    BLACK("#000000");

    private String hexValue;

    private Colors(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getHexValue() {
        return hexValue;
    }
}