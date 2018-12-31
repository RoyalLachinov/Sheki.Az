package administration;

class Administration_Citizen_Accept_Entity {
    private final String days;
    private final String fullName;
    private final String position;
    private final String hours;

    public Administration_Citizen_Accept_Entity(String days, String fullName, String position) {
        this.days = days;
        this.fullName = fullName;
        this.position = position;
        this.hours = "10.00-dan";
    }

    public String getDays() {
        return days;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getHours() {
        return hours;
    }

}
