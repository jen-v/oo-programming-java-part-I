public class Player {
    private String name;
    private int goals;

    public Player(String name) {
        this(name, 0);
    }

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return this.name;
    }

    public int goals() {
        return this.goals;
    }

    public String toString() {
        String playerAsString = "";

        return playerAsString
                + this.name
                + ", goals "
                + this.goals;
    }
}
