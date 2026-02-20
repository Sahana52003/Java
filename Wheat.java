class Wheat extends Crop {
public void grind() { 
System.out.println(" ground into flour."); 
}
 public void fertilize() { 
System.out.println("can fertilized"); 
}
 public static void main(String[] args) {
Crop crop = new Wheat(); 
crop.grow();
crop.harvest();
if (crop instanceof Wheat) {
Wheat wheat = (Wheat)crop;
wheat.grind();
wheat.fertilize();
}else{
System.out.println("NOt assigned");
}
}
}