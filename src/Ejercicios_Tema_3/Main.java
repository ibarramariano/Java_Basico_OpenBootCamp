package Ejercicios_Tema_3;

public class Main {

    public static void main(String[] args){
        SmartDevice nuevoReloj, nuevoTelefono;
        nuevoReloj = new SmartWatch("Casio", "Running","Android");
        System.out.printf(nuevoReloj.toString());
        nuevoTelefono = new SmartPhone("Apple","X","IOS");
        System.out.printf("\n"+nuevoTelefono.toString());
    }
}
