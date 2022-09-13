package Ejercicios_Tema_3;

public class SmartWatch extends SmartDevice {

    SmartWatch(String marca, String modelo, String sistemaOperativo){
        super(marca,modelo,sistemaOperativo);
    }

    public static void main(String[] args) {
        SmartWatch reloj = new SmartWatch("iphone","X","ios");
        System.out.printf(reloj.toString());
    }

    @Override
    public String toString() {
        return "smartWatch{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
