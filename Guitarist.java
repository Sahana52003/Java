class Guitarist extends Musician {
String instrument = "Guitar";
double income = 30000.50;
public void playSolo() {
System.out.println(" solo performance in progress"+income);
}
public void tuneGuitar() {
System.out.println("Tuning the " + instrument + " for the next show."+super.experience);
}
public static void main(String[] args) {
Musician mus=new Musician();
mus.perform();
mus.practice();
Guitarist g = new Guitarist();
g.playSolo();
g.tuneGuitar();
Musician musician=new Guitarist();
System.out.println("Paying a "+musician.instrument);
}
}