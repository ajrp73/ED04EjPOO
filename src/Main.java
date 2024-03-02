public class Main {

    public static void main(String[] args){
        Circulo2D c1= new Circulo2D();
        System.out.println("c1: " + c1.toString());
        c1.setCy(4);
        System.out.println("c1: " + c1.toString());
        Circulo2D c2= new Circulo2D();
        System.out.println("c2: " + c2.toString());
        c2.copiarDeCirculo(c1);
        System.out.println("c2: " + c2.toString());
        Circulo2D c3= new Circulo2D(2, 2, 2.0);
        System.out.println("c3: " + c3.toString());
        Circulo2D c4= c2.getCirculoMayorRadio(c3);
        System.out.println("c4: " + c4.toString());
        c4.setCy(12);
        System.out.println("c3: " + c3.toString());

        Circulo2DColor c5c = new Circulo2DColor();
        System.out.println("c5c: " + c5c.toString());


    }
}
