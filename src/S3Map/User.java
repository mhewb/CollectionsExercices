package S3Map;

public class User {

    private String name;
    private Region region;

    public User(String name, Region region) {
        this.name = name;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public Region getRegion() {
        return region;
    }
}
