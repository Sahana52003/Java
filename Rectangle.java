class Rectangle {
    int width;
    int height;
    String color;
    boolean isfilled;
    char code;
    public Rectangle() {
        this(10); 
        System.out.println("No-args constructor called");
    }
    public Rectangle(int width) {
        this(3, 5);  
        System.out.println("Rectangle initialized with custom width=" + this.width);
    }
    public Rectangle(int width, int height) {
        this(6, 8, "white");  
        System.out.println("There width and heigth are : " + this.width + this.height);
    }
    public Rectangle(int width, int height, String color) {
        this(4,6,"black",true);
        System.out.println("Where the Rectangle color is : " + color + " and had changed width and heigth : " + this.width + this.height);
    }

    public Rectangle(int width, int height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.isfilled = isfilled;
        this.code = 'R'; 
        System.out.println("The rectangle code is : " + code + " Is the color is fixed : " + isfilled + " with the heigth and width : " + height + width + "having a color : " + color);
    }
   }
