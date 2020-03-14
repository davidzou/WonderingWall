public class People {
    private final String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return (this.name.length() % 2 == 0) ? 31 : 95;
    }

    @Override
    public boolean equals(Object obj) {
        People other = (People) obj;
        if (this.name.equalsIgnoreCase(other.name)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
