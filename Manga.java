class Manga extends Comic {
    void translate() {
        System.out.println("having some info and pics...");
    }
public static void main(String[] args) {
        Manga manga = new Manga();
        manga.read();       
        manga.illustrate(); 
        manga.translate();  
	Book bk=manga;
	bk.read();
	
	Comic cc=manga;
	cc.illustrate();
	cc.read();
    }
}