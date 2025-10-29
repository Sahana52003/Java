class Football extends Game {
String type = "Vollyball";
double duration = 90.0;
public void kickOff() { 
System.out.println("kick the ball"+super.players); 
}
public void goal() { 
super.start();
System.out.println("tried a good shot to reach a goal"+type);
}
public static void main(String[] args) {
Game game=new Game();
game.start();
game.end();

Football f = new Football();
f.kickOff();
f.goal();
System.out.println("Time duration "+f.duration);
Game gam=new Football();
System.out.println("Name of the game"+gam.type);
}
}