public enum StationType {
    RADIOONE(1, "RadioOne"),
    FORTHONE(2, "ForthOne"),
    RADIOFOURTH(4,"RadioFour");

    private final int value;
    private final String name;

    StationType(int value, String name){
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
