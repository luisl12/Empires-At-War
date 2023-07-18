package domain.entities;

public class Player {

    // required
    private final String uuid;
    private final String username;

    // optional
    private final String email;
    private final String password;

    private Player(PlayerBuilder builder) {
        this.uuid = builder.uuid;
        this.username = builder.username;
        this.email = builder.email;
        this.password = builder.password;
    }

    public String getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return String.format("Player(uuid=%s, username=%s)", this.uuid, this.username);
    }

    public static class PlayerBuilder {

        // required
        private final String uuid;
        private final String username;

        // optional
        private String email;
        private String password;

        public PlayerBuilder(String uuid, String username) {
            this.uuid = uuid;
            this.username = username;
        }

        public PlayerBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PlayerBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}
