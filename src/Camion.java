public class Camion  extends Vehiculo{

    public Camion(String marca, String modelo, String tipoCombustible) {
        super(marca, modelo, tipoCombustible);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }

    @Override
    public String abastecerCombustible() {
        return super.abastecerCombustible();
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
    public String getTipoCombustible() {
        return super.getTipoCombustible();
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
    public void setTipoCombustible(String tipoCombustible) {
        super.setTipoCombustible(tipoCombustible);
    }

}
