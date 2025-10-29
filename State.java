class State extends Country {
String name = "Karnataka";
double gdp = 250.75;
public void grow() { 
System.out.println("Increasing number of people in "+name+gdp); 
}
public void display() { 
System.out.println("Toatl number of population"+super.population+"in"+super.name); 
super.area();
}
public static void main(String[] args) {
Country country=new Country();
country.describe();
country.area();
State s = new State();
s.grow();
s.display();
Country count=new State();
System.out.println("Name of the country"+count.name);
}
}