class GameEngine {
String gameTitle;
int maxPlayers;
boolean isMultiplayer;
double gameVersion=11.5;
long totalScore=45678875l;
public GameEngine() {
System.out.println("The GameEngine ");
}
public GameEngine(String gameTitle) {
System.out.println("The game name is "+gameTitle);
}
public GameEngine(int maxPlayers,boolean isMultiplayer) {
System.out.println("Is games is avaliable"+isMultiplayer+"and their player"+maxPlayers);
}
public static void main(String[] args){  
GameEngine ge=new GameEngine();
GameEngine ge1=new GameEngine("Space Quest");
GameEngine ge2=new GameEngine(4,true);
System.out.println("The toatal Score for Space Quest game are : " + ge2.totalScore);
System.out.println("The Game Version is : " +ge2.gameVersion);
}
}