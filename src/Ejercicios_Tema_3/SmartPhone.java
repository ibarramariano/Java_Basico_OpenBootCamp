package Ejercicios_Tema_3;

public class SmartPhone extends SmartDevice {
    SmartPhone(String marca, String modelo, String sistemaOperativo){
        super(marca,modelo,sistemaOperativo);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
