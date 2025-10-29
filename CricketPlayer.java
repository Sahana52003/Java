class CricketPlayer extends Player 
{
String name="MS Dhoni";
char code='A';
public void status(){
super.play();
System.out.println("Match status is "+super.name+name);
}
public void celebrate() {
System.out.println(" celebrating their victory"+super.noOfPlayers+"their code is "+code);
}
public static void main(String[] args) {
Player player=new Player();
player.train();
player.play();
CricketPlayer cp=new CricketPlayer();
cp.status();
cp.celebrate();
Player playe=new CricketPlayer();
System.out.println(playe.name);
}
}