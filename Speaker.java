class Speaker {
    String brand;
    byte volume;
    char type;
    float price;
    long serialNumber;

    public Speaker(String brand, byte volume, char type, float price, long serialNumber) {
        this.brand = brand;
        this.volume = volume;
        this.type = type;
        this.price = price;
        this.serialNumber = serialNumber;
        System.out.println("Speaker: " + brand + "  Volume: " + volume + " Type: " + type + "  Price: " + price + "  Serial: " + serialNumber);
        playMusic();
    }

    public void playMusic() {
        System.out.println(brand + " playing music");
        adjustVolume();
    }

    public void adjustVolume() {
        System.out.println(brand + " adjusting volume");
        stopMusic();
    }

    public void stopMusic() {
        System.out.println(brand + " stopped music");
    }

  
}
