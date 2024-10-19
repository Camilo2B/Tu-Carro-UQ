package co.edu.uniquindio.poo;

public class Vehiculo {
    public  String marca;
    public  String uso;
    public  String modelo;
    public  String cambios;
    public  int velocidadMaxima;
    public  String cilindraje;

    public Vehiculo(String marca, String uso, String modelo, String cambios, String velocidadMaxima, String cilindraje){
        this.marca = marca;
        this.uso = uso;
        this.cambios = cambios;
        this.cilindraje = cilindraje;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", uso=" + uso + ", modelo=" + modelo + ", cambios=" + cambios
                + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + "]";
    }

    

    
}

    

