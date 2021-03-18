package dogkennel;

public class Owner {
    String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
