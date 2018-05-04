package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.nCopies;

public class Composite extends Component {

    Composite(String name) {
        this.name = name;
    }

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public String toString(int depth) {
        StringBuilder builder = new StringBuilder(String.join("", nCopies(depth, "-")))
                .append(name)
                .append("\n");
        for (Component component : components)
            builder.append(component.toString(depth + 2));
        return builder.toString();
    }

    public String passExam() {
        return "Group " + name + " passes exam now!!!";
    }
}