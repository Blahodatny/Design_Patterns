package patterns.structural.composite;

import static java.util.Collections.nCopies;

public class Leaf extends Component {

    Leaf(String name) {
        this.name = name;
    }

    public void add(Component component) {
        throw new UnsupportedOperationException("Impossible operation!!!");
    }

    public String toString(int depth) {
        return String.join("", nCopies(depth, "-")).concat("Student " + name + "\n");
    }

    public String passExam() {
        return "Student " + name + " passes exam now!!!";
    }
}