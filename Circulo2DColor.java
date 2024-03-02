public class Circulo2DColor extends Circulo2D{
    String color;

    public Circulo2DColor() {
        super();
        color="Blanco";
    }

    public Circulo2DColor(int cx, int cy, double radio, String color) {
        super(cx, cy, radio);
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "cx:" + cx +
                ", cy:" + cy +
                ", radio:" + radio +
                ", color: " + color
                '}';
    }
}
