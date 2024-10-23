abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String tipoCombustible;

    public Vehiculo(String marca, String modelo) {
    }

    public Vehiculo(String marca, String modelo, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }

    public String encenderVehiculo() {
        System.out.println("VEHICULO ENCENDIDO");
        return "";
    }
    public String apagarVehiculo() {
        System.out.println("VEHICULO APAGADO");
        return "";
    }

    public String abastecerCombustible() {
        System.out.println("VEHICULO ABASTECIDO DE COMBUSTIBLE");
        return "";
    }

    public String mostraInformacion() {
        System.out.println("MARCA" + marca);
        System.out.println("MODELO" + modelo);
        System.out.println("TIPO DE COMBUSTIBLE" + tipoCombustible);
        return "";
    }
}

