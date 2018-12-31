package about;

public class About_Main_Entity {

    private final int picture;
    private final String  indicator;

    public About_Main_Entity(int picture, String indicator) {
        this.picture = picture;
        this.indicator = indicator;
    }

    public int getPicture() {
        return picture;
    }

    public String getIndicator() {
        return indicator;
    }
}
