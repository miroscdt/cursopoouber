class Main {
    public static void main (String [] args ){
        System.out.printLn("Hola Mundo");

        //Creando un objeto con sus atributos.
        UberX uberX = new UberX("AMQ123", new Account("Andrés Vazques", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar(); 

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        /*Car car2 = new Car("ETT456", new Account("Alan Mata", "ANDA456" ));
        car2.passenger = 4;
        car2.printDataCar(); */
    }
}