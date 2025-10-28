class Chess extends Game {
public Chess() {
super(); 
System.out.println("Default constructor of Chess");
}
public Chess(int boardSize) {
super(false); 
System.out.println("Chess board size " + boardSize);
}
public Chess(String tournamentName, int year) {
super("Chess", 2);
System.out.println("Tournament name is " + tournamentName+"In year"+year);
}
public static void main(String[] args) {
Chess che=new Chess();
Chess chess=new Chess(8);
Chess ch=new Chess("WCC",2012);
}
}
