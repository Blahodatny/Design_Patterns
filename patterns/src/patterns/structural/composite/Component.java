package patterns.structural.composite;

public abstract class Component {
    String name;

    public abstract void add(Component component);

    public abstract String toString(int depth);

    public abstract String passExam();
}