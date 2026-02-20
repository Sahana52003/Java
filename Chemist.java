class Chemist extends Scientist {
String field = "Chemistry"; 
double labBudget = 120000.75;
public void mixChemicals() {
System.out.println("adding some of the chemicals in the lab"+super.field);
}
public void analyzeResults() {
System.out.println("Analyzing the results"+field+labBudget);
}
public static void main(String[] args) {
Scientist sc=new Scientist();
sc.research();
sc.publish();
System.out.println("Total number of exp"+sc.experiments);
Chemist che = new Chemist();
che.mixChemicals();
che.analyzeResults();
System.out.println("field name " + che.field);
Scientist sciet= new Chemist();
System.out.println("Lab budget " + sciet.field);
}
}