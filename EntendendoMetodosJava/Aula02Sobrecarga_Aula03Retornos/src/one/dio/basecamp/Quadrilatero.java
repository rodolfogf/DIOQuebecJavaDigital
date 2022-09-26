package one.dio.basecamp;

public class Quadrilatero {

    public Quadrilatero() {
    }

    public static double calcularArea(double lado){

        return Math.pow(lado, 2);
    }

    public static double calcularArea(double lado1, double lado2){

        return lado1 * lado2;
    }

    public static double calcularArea(double base_maior, double base_menor, double altura){

        return (base_maior + base_menor) * altura / 2;
    }

}
