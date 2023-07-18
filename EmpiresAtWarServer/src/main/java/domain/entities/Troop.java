package domain.entities;

public class Troop {

    // required
    private final String uuid;
    private final String name;

    // optional
    private final int attack;
    private final int defense;
    private final float trainingTime;
    private final float speed;
    private final String resourcesCost;

    private Troop(TroopBuilder builder) {
        this.uuid = builder.uuid;
        this.name = builder.name;
        this.attack = builder.attack;
        this.defense = builder.defense;
        this.trainingTime = builder.trainingTime;
        this.speed = builder.speed;
        this.resourcesCost = builder.resourcesCost;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public float getTrainingTime() {
        return trainingTime;
    }

    public float getSpeed() {
        return speed;
    }

    public String getResourcesCost() {
        return resourcesCost;
    }

    @Override
    public String toString() {
        return String.format("Troop(uuid=%s, name=%s)", this.uuid, this.name);
    }

    public static class TroopBuilder {

        // required
        private final String uuid;
        private final String name;

        // optional
        private int attack;
        private int defense;
        private float trainingTime;
        private float speed;
        private String resourcesCost;

        public TroopBuilder(String uuid, String name) {
            this.uuid = uuid;
            this.name = name;
        }

        public TroopBuilder setAttack(int attack) {
            this.attack = attack;
            return this;
        }

        public TroopBuilder setDefense(int defense) {
            this.defense = defense;
            return this;
        }

        public TroopBuilder setTrainingTime(float trainingTime) {
            this.trainingTime = trainingTime;
            return this;
        }

        public TroopBuilder setSpeed(float speed) {
            this.speed = speed;
            return this;
        }

        public TroopBuilder setResourcesCost(String resourcesCost) {
            this.resourcesCost = resourcesCost;
            return this;
        }

        public Troop build() {
            return new Troop(this);
        }
    }
}
