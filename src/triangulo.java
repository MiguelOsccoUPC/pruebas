public class triangulo implements poligono{

    private  double lado1;
    private double lado2;
    private double lado3;

    public triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    @Override
    public double calculararea() {
        double p=((lado1+lado2+lado3)/2.0);
        return p*(p-lado1-lado2);
    }
}
