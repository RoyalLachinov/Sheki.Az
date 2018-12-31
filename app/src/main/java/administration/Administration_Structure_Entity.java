package administration;

public class Administration_Structure_Entity {
    private final String position;
    private final String fullName;
    private final String phone;

    public Administration_Structure_Entity(String position, String fullName, String phone) {
        this.position = position;
        this.fullName = fullName;
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

}
