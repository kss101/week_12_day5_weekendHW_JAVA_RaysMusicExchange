public enum PianoType {
    BEGINNER(66),
    STANDARD(72),
    CLASSICAL(88);

    private final int value;

    PianoType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
