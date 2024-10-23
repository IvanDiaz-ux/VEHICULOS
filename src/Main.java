// IVAN CAMILO DIAZ RODRIGUEZ 935388
public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Ford","Fiesta","Gasolina");
        carro1.mostraInformacion();
        carro1.encenderVehiculo();
        carro1.apagarVehiculo();
        carro1.abastecerCombustible();
        System.out.println("------------------------------------");
        Moto moto1 = new Moto("Bajaj","Pulsar","Gasolina");
        moto1.mostraInformacion();
        moto1.encenderVehiculo();
        moto1.apagarVehiculo();
        moto1.abastecerCombustible();
        System.out.println("______________________________________");
        Camion camion1 = new Camion("Volvo","FH16","Diesel");
        camion1.mostraInformacion();
        camion1.encenderVehiculo();
        camion1.apagarVehiculo();
        camion1.abastecerCombustible();
        System.out.println("______________________________________");
        CarroElectrico carroe1 = new CarroElectrico("Volvo","C40 P8");
        carroe1.mostraInformacion();
        carroe1.encenderVehiculo();
        carroe1.apagarVehiculo();
        carroe1.nivelBateria();
        carroe1.cargarBateria();



    }
}