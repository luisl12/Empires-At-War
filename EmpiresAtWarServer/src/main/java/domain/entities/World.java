package domain.entities;

public class World {

    private final String uuid;
    private final String name;

    public World(String uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }
}
