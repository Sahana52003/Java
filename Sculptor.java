class Sculptor extends Artist 
{
public void carve(){
System.out.println("using a solid materials ");
}
public static void main(String[] args){
Artist art=new Painter();
art.sketch();
Painter paint=(Painter)art;
paint.style();
Artist artist=new Sculptor();
artist.sketch();
Sculptor scu=(Sculptor)artist;
scu.carve();
}
}