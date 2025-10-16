class Apartment extends Residential {
    void occupy() {
        System.out.println("Ready to Occupy ......");
    }
public static void main(String[] args){
Apartment apart=new Apartment();
apart.design();
apart.occupy();
apart.construct();
System.out.println("-----------");
Residential  res=new Apartment();
res.design();
res.construct();
Buildings bi=new Residential();
bi.construct();
Buildings build=new Apartment();
build.construct();
}
}