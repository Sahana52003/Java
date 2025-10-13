class Camera {
    String brand;
    boolean isAvailable;
    int megapixels;
    double price;
	char code;
    public Camera(String brand, boolean isAvailable, int megapixels, double price,char code) {
        this.brand = brand;
        this.isAvailable = isAvailable;
        this.megapixels = megapixels;
        this.price = price;
	this.code=code;
        System.out.println("Camera: " + brand + "Available: " + isAvailable + " MP: " + megapixels + " Price: " + price+code);
        takePhoto();
    }

    public void takePhoto() {
        System.out.println("Taking photo with " + brand);
        recordVideo();
    }

    public void recordVideo() {
        System.out.println(brand + " recording video...");
        powerOff();
    }

    public void powerOff() {
        System.out.println(brand + " is powered OFF...");
    }

    
}
