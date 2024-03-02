import java.util.Objects;

public class Circulo2D {
    protected int cx, cy;
    protected double radio;

    //Constructor por defecto: Inicializa los atributos con valores fijos
    public Circulo2D() {
        cx=0;
        cy=0;
        radio=1.0;
    }

    //Constructor totalmente parametrizado
    public Circulo2D(int cx, int cy, double radio) {
        this.cx = cx;
        this.cy = cy;
        this.radio = radio;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo2D)) return false;
        Circulo2D circulo2D = (Circulo2D) o;
        return getCx() == circulo2D.getCx() && getCy() == circulo2D.getCy() && Double.compare(circulo2D.getRadio(), getRadio()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCx(), getCy(), getRadio());
    }

    @Override
    public String toString() {
        return "{" +
                "cx:" + cx +
                ", cy:" + cy +
                ", radio:" + radio +
                '}';
    }

    public  void copiarDeCirculo(Circulo2D o){
        this.cx= o.getCx();
        this.cy= o.getCy();
        this.radio= o.getRadio();
    }

    //Definir un método que reciba un circulo y devuelva
    //el circulo de mayor radio
    public Circulo2D getCirculoMayorRadio(Circulo2D c){
        if ( this.getRadio() >= c.getRadio()){
            return this;
        }else{
            return c;
        }
    }

}
