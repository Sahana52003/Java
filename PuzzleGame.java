class PuzzleGame extends Game 
{
public void puzzleSolve() {
System.out.println("Solve the game");
}

public void Hint() {
System.out.println("Having Hint option");
}
public static void main(String[] args) {
Game game = new PuzzleGame();
game.start();
game.login();
if (game instanceof PuzzleGame) {
PuzzleGame puzzle = (PuzzleGame) game;
puzzle.puzzleSolve();
puzzle.Hint();
}else{
System.out.println("Not a game");
}
}
}