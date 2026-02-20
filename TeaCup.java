class TeaCup extends Cup {
public void addSugar() { 
System.out.println("Sugar added to tea."); 
}
public void stirTea() {
System.out.println("Tea is stirred with spoon.");
}
public static void main(String[] args) {
Cup cup= new TeaCup();
cup.fill();
cup.empty();
Cup cu=new Cup();
if (cu instanceof TeaCup) {
TeaCup teacup = (TeaCup)cup;
teacup.addSugar();
teacup.stirTea();
}else{
System.out.println("Not An Cup");
}
}
}