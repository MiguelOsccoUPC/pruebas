public class rectangulo implements poligono{

     private double lado1;
     private double lado2;

    public rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calculararea() {
        return lado1*lado2;
    }
}
