class Flower {
public Flower() {
this("Jasmin");
System.out.println("No argsconstructor");
}
public Flower(String name) {
this(4,"white");
System.out.println("flower name " + name);
}
public Flower(int petals, String color) {
System.out.println("flower has around"+ petals + "having a color " + color);
}
}
