class AirConditioner {
    String brand;
    byte temperature;
    char type;
    float price;
    long serialNumber;

    public AirConditioner(String brand, byte temperature, char type, float price, long serialNumber) {
        this.brand = brand;
        this.temperature = temperature;
        this.type = type;
        this.price = price;
        this.serialNumber = serialNumber;
        System.out.println("AC: " + brand + "  Temp: " + temperature + " Type: " + type + "  Price: " + price + " Serial: " + serialNumber);
        turnOn();
    }

    public void turnOn() {
        System.out.println(brand + " AC turned ON");
        cool();
    }

    public void cool() {
        System.out.println(brand + " cooling at " + temperature + "C");
        turnOff();
    }

    public void turnOff() {
        System.out.println(brand + " AC turned OFF");
    }


}
