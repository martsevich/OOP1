package clients;

public class Owner {
    String fullName;

    public Owner(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "clients.Owner{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
