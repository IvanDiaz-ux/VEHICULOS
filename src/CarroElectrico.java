public class CarroElectrico  extends Vehiculo implements VehiculoElectrico{

    public CarroElectrico(String marca, String modelo) {
        super (marca, modelo);
    }

    @Override
    public String toString() {
        return "CarroElectrico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public String apagarVehiculo() {
        return super.apagarVehiculo();
    }

    @Override
    public String encenderVehiculo() {
        return super.encenderVehiculo();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public String mostraInformacion() {
        return super.mostraInformacion();
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public void cargarBateria() {

    }

    @Override
    public void nivelBateria() {

    }
}
