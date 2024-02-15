package Enums;

public enum TimeOfDay {
    MORNING("утро"),DAY("день"), EVENING("вечер");
    private String translation;
    TimeOfDay(String translation){
        this.translation=translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
