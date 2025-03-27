public class CirculoTest {

    public static void main(String[] args) {
        Circulo circle = new Circulo();
        System.out.println("====================");
        System.out.println("\tCirculo");
        System.out.println("====================");
        System.out.println("Radio: " + circle.getRadio());
        System.out.println("Area: " + circle.getArea());
        System.out.println("====================");

        Circulo circle2 = new Circulo(6.55);
        System.out.println("====================");
        System.out.println("\tCirculo 2");
        System.out.println("====================");
        System.out.println("Radio: " + circle2.getRadio());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("====================");

        Circulo circle3 = new Circulo();
        circle3.setRadio(12.5);
        circle3.setColor("blanco");
        System.out.println("====================");
        System.out.println("\tCirculo 3");
        System.out.println("====================");
        System.out.println("Radio: " + circle3.getRadio());
        System.out.println("Area: " + circle3.getArea());
        System.out.println("====================");
    }
}

