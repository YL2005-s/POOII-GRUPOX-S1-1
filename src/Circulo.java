public class Circulo {
    private double radio;
    private String color;

    public Circulo() {
        this.radio = 12.5;
        this.color = "azul";
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.color = "azul";
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo { radio = " + radio + ", color = '" + color + "' }";
    }
}
