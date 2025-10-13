class Headphones {
    String brand;
    boolean wireless;
    char type;
    float price;
	long serialNumber;
    public Headphones(String brand, boolean wireless, char type, float price,long serialNumber) {
        this.brand = brand;
        this.wireless = wireless;
        this.type = type;
        this.price = price;
	this.serialNumber=serialNumber;
        System.out.println("HEADPHONES NAME " + brand);
        playMusic();
    }
	
    public void playMusic() {
        System.out.println("Playing music on " + type);
        adjustVolume();
    }

    public void adjustVolume() {
        System.out.println("Adjusting volume on : " + brand + serialNumber);
        stopMusic();
    }

      public void stopMusic() {
        System.out.println(brand + " stopped music");
    }

   }
