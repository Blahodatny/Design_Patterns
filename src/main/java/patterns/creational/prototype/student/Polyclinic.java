package patterns.creational.prototype.student;

public class Polyclinic extends Student {
    private double weight;
    private float height;

    public Polyclinic() { }

    private Polyclinic(Polyclinic polyclinic) {
        super(polyclinic);
        if (polyclinic != null) {
            this.weight = polyclinic.weight;
            this.height = polyclinic.height;
        }
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        var that = (Polyclinic) o;
        return Double.compare(that.weight, weight) == 0 &&
                Float.compare(that.height, height) == 0;
    }

    public Student clone() { return new Polyclinic(this); }

    public void setWeight(double weight) { this.weight = weight; }

    public void setHeight(float height) { this.height = height; }
}