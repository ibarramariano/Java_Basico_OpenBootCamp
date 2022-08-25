package Ejercicios_Tema_1;

public class Variables {

    public static void main(String[] args){
        Variables test = new Variables();
        System.out.println(test);
    }

    // Enteros
    int entero1 = 0;
    long entero2 = 10;

    // Flotantes
    float decimal1 = 100.0f;
    double decimal2 = 200.00d;

    // Booleanos
    boolean verdadero = true;
    boolean falso = false;

    // Cadenas de texto
    String cadena = "hola mundo";

    @Override
    public String toString() {
        return "Variables{" +
                "entero1=" + entero1 +
                ", entero2=" + entero2 +
                ", decimal1=" + decimal1 +
                ", decimal2=" + decimal2 +
                ", verdadero=" + verdadero +
                ", falso=" + falso +
                ", cadena='" + cadena + '\'' +
                '}';
    }
}
