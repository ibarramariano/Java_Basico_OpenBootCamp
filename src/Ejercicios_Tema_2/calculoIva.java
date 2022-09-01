package Ejercicios_Tema_2;

public class calculoIva {

    public static void main(String[] args) {
        double precio = 10.00;
        System.out.printf("El precio sin Iva es: "+precio+" y el precio con Iva es: "+getIva(precio));
    }

    static double getIva(double precio) {
        return (precio*0.21)+precio;
    }
}
