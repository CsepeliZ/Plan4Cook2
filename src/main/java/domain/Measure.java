package domain;

public enum Measure {

    CAN("doboz"),  // same as BOTTLE, BOX etc.
    CLOVE("gerezd"),  // for clove, orange etc.
    GRAM("g"),
    LITRE("l"),
    PIECE("db"),  // for egg, onion etc.
    PINCH("csipet"),
    SLICE("szelet"),
    TABLESPOON("ek"),
    TEASPOON("tk");


    private final String displayName;

    Measure(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
