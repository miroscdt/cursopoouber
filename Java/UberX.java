class UberX extends Car{
    String brand;
    String model;

    //CONSTRUCTOR haciendo referencia a la super clase Car.
    public UberX(String license, Account driver, String brand, String model){
      super(license, driver); 
      this.brand = brand;
      this.model = model;
   }

   @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);
    }
}