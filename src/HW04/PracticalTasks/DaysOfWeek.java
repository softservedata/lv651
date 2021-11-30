package HW04.PracticalTasks;

public enum DaysOfWeek {
    MONDAY("Monday", "Понедельник", "Понеділок"),
    TUESDAY("Tuesday", "Вторник", "Вівторок"),
    WEDNESDAY("Wednesday", "Среда", "Середа"),
    THURSDAY("Thursday", "Четверг", "Четвер"),
    FRIDAY("Friday", "Пятница", "П'ятниця"),
    SATURDAY("Saturday", "Суббота", "Субота"),
    SUNDAY("Sunday", "Воскресенье", "Неділя");

    private String titleEn;
    private String titleRu;
    private String titleUa;


    DaysOfWeek(String titleEn, String titleRu, String titleUa) {
        this.titleEn = titleEn;
        this.titleRu = titleRu;
        this.titleUa = titleUa;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public String getTitleRu() {
        return titleRu;
    }

    public String getTitleUa() {
        return titleUa;
    }

    @Override
    public String toString() {
        return "DaysOfWeek{" +
                "English='" + titleEn + '\'' +
                ", Русский='" + titleRu + '\'' +
                ", Українською='" + titleUa + '\'' +
                '}';
    }
}

