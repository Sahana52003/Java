class Game {
public Game() {
this(true);
System.out.println("No args constructor");
}
public Game(boolean isOnline) {
this("Ludo",4);
System.out.println("is Game avaliable:"+isOnline);
}
public Game(String name, int players) {
System.out.println("Game name "+ name + "number of players"+players);
    }
}