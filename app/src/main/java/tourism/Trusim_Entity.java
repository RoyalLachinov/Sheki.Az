package tourism;

class Trusim_Entity {

    private final int sekil;
    private final String name;
    private final String address;

    public Trusim_Entity(int sekil, String name, String address) {
        this.sekil = sekil;
        this.name = name;
        this.address = address;
    }

    public int getSekil() {return sekil;}

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
