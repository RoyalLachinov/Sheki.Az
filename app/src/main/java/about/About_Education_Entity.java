package about;

class About_Education_Entity {

    private final String number;
    private final String schoolNumber;
    private final String address;
    private final String managment;
    private final String phone;

    public About_Education_Entity(String number, String schoolNumber, String address, String managment, String phone) {
        this.number = number;
        this.schoolNumber = schoolNumber;
        this.address = address;
        this.managment = managment;
        this.phone = phone;
    }


    public String getNumber() {
        return number;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getManagment() {
        return managment;
    }

    public String getPhone() {
        return phone;
    }


}
