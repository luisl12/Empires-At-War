package domain.entities;

public class Empire {

    // required
    private final String uuid;
    private final String name;

    // optional
    private final int points;
    private final int currPopulation;
    private final int currCapacity;
    private final int currWood;
    private final int currClay;
    private final int currIron;

    private Empire(EmpireBuilder builder) {
        this.uuid = builder.uuid;
        this.name = builder.name;
        this.points = builder.points;
        this.currPopulation = builder.currPopulation;
        this.currCapacity = builder.currCapacity;
        this.currWood = builder.currWood;
        this.currClay = builder.currClay;
        this.currIron = builder.currIron;
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

    public int getCurrPopulation() {
        return currPopulation;
    }

    public int getCurrCapacity() {
        return currCapacity;
    }

    public int getCurrWood() {
        return currWood;
    }

    public int getCurrClay() {
        return currClay;
    }

    public int getCurrIron() {
        return currIron;
    }

    @Override
    public String toString() {
        return String.format("Empire(uuid=%s, name=%s)", this.uuid, this.name);
    }

    public static class EmpireBuilder {

        // required
        private final String uuid;
        private final String name;

        // optional
        private int points;
        private int currPopulation;
        private int currCapacity;
        private int currWood;
        private int currClay;
        private int currIron;

        public EmpireBuilder(String uuid, String name) {
            this.uuid = uuid;
            this.name = name;
        }

        public EmpireBuilder setPoints(int points) {
            this.points = points;
            return this;
        }

        public EmpireBuilder setCurrPopulation(int currPopulation) {
            this.currPopulation = currPopulation;
            return this;
        }

        public EmpireBuilder setCurrCapacity(int currCapacity) {
            this.currCapacity = currCapacity;
            return this;
        }

        public EmpireBuilder setCurrWood(int currWood) {
            this.currWood = currWood;
            return this;
        }

        public EmpireBuilder setCurrClay(int currClay) {
            this.currClay = currClay;
            return this;
        }

        public EmpireBuilder setCurrIron(int currIron) {
            this.currIron = currIron;
            return this;
        }

        public Empire build() {
            return new Empire(this);
        }
    }
}
