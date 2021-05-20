package patterns.structural.proxy.example;

public class User {
    private final double moneyCount;
    private final String name;

    public User(double moneyCount, String name) {
        this.moneyCount = moneyCount;
        this.name = name;
    }

    double getMoneyCount() { return moneyCount; }

    String getName() { return name; }
}