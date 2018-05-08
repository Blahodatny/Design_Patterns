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
        var builder = new StringBuilder(String.join("", nCopies(depth, "-")))
                .append(name)
                .append("\n");
        components.stream().map(component -> component.toString(depth + 2)).forEach(builder::append);
        return builder.toString();
    }

    public String passExam() {
        return "Group " + name + " passes exam now!!!";
    }
}