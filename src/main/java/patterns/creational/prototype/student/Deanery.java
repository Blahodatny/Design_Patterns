package patterns.creational.prototype.student;

public class Deanery extends Student {
    private int progress;

    public Deanery() { }

    private Deanery(Deanery deanery) {
        super(deanery);
        if (deanery != null)
            this.progress = deanery.progress;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        return progress == ((Deanery) o).progress;
    }

    public Student clone() { return new Deanery(this); }

    public void setProgress(int progress) { this.progress = progress; }
}