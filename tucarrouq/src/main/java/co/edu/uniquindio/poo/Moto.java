package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
  

    public Moto(String marca, String uso, String modelo, String cambios, String velocidadMaxima, String cilindraje){
        super(marca, uso, modelo, cambios, velocidadMaxima, cilindraje);

    }

    @Override
    public String toString() {
        return "Moto []"+super.toString();
    }

    

}
