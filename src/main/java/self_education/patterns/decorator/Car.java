package self_education.patterns.decorator;

public class Car {
    private Color color;
    private Labeles labeles;
    private Interier interier;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Labeles getLabeles() {
        return labeles;
    }

    public void setLabeles(Labeles labeles) {
        this.labeles = labeles;
    }

    public Interier getInterier() {
        return interier;
    }

    public void setInterier(Interier interier) {
        this.interier = interier;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color=").append(color);
        sb.append(", labeles=").append(labeles);
        sb.append(", interier=").append(interier);
        sb.append('}');
        return sb.toString();
    }
}
