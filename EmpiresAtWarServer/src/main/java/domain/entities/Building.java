package domain.entities;

public class Building {

    // required
    private final String uuid;
    private final String name;

    // optional
    private final int points;
    private final int level;
    private final float constructionTime;
    private final String resourcesCost;
    private final int woodRate;
    private final int ironRate;
    private final int clayRate;
    private final int maxPopulation;
    private final int capacity;

    private Building(BuildingBuilder builder) {
        this.uuid = builder.uuid;
        this.name = builder.name;
        this.points = builder.points;
        this.level = builder.level;
        this.constructionTime = builder.constructionTime;
        this.resourcesCost = builder.resourcesCost;
        this.woodRate = builder.woodRate;
        this.ironRate = builder.ironRate;
        this.clayRate = builder.clayRate;
        this.maxPopulation = builder.maxPopulation;
        this.capacity = builder.capacity;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getLevel() {
        return level;
    }

    public float getConstructionTime() {
        return constructionTime;
    }

    public String getResourcesCost() {
        return resourcesCost;
    }

    public int getWoodRate() {
        return woodRate;
    }

    public int getIronRate() {
        return ironRate;
    }

    public int getClayRate() {
        return clayRate;
    }

    public int getMaxPopulation() {
        return maxPopulation;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return String.format("Building(uuid=%s, name=%s)", this.uuid, this.name);
    }

    public static class BuildingBuilder {

        // required
        private final String uuid;
        private final String name;

        // optional
        private int points;
        private int level;
        private float constructionTime;
        private String resourcesCost;
        private int woodRate;
        private int ironRate;
        private int clayRate;
        private int maxPopulation;
        private int capacity;

        public BuildingBuilder(String uuid, String name) {
            this.uuid = uuid;
            this.name = name;
        }

        public BuildingBuilder setPoints(int points) {
            this.points = points;
            return this;
        }

        public BuildingBuilder setLevel(int level) {
            this.level = level;
            return this;
        }

        public BuildingBuilder setConstructionTime(float constructionTime) {
            this.constructionTime = constructionTime;
            return this;
        }

        public BuildingBuilder setResourcesCost(String resourcesCost) {
            this.resourcesCost = resourcesCost;
            return this;
        }

        public BuildingBuilder setWoodRate(int woodRate) {
            this.woodRate = woodRate;
            return this;
        }

        public BuildingBuilder setIronRate(int ironRate) {
            this.ironRate = ironRate;
            return this;
        }

        public BuildingBuilder setClayRate(int clayRate) {
            this.clayRate = clayRate;
            return this;
        }

        public BuildingBuilder setMaxPopulation(int maxPopulation) {
            this.maxPopulation = maxPopulation;
            return this;
        }

        public BuildingBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Building build() {
            return new Building(this);
        }
    }
}
