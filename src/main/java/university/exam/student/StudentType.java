package university.exam.student;

public enum StudentType {
    ZUBRAC("Зубрач"),
    TARIKAT("Тарикат"),
    KALITKO("Калитко");

    private final String displayName;

    StudentType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
