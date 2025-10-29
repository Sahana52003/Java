class Painter extends Artist {
String style = "Human";
double income = 25000.75;
public void paint() { 
System.out.println("Painting an art "+super.style); 
}
public void sellArt() { 
System.out.println("Painter has sold their art "+style + " with the price"+income); 
}
public static void main(String[] args) {
Artist art=new Artist();
art.draw();
art.exhibit();
System.out.println("number of worked"+art.artworks);
Painter p = new Painter();
p.paint();
p.sellArt();
Artist artsti=new Painter();
System.out.println("Name of the art"+artsti.style);
    }
}