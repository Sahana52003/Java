class Manager extends Company {
String name = "Ram";
double salary = 85000.50;
public void manage() { 
super.report();
System.out.println("managing sme of the operations with"+ name+"Having a salary"+salary); 
}
public void conductMeeting() { 
System.out.println("conductong a meeting with team mates"+"And total emp in company"+super.employees+super.name); 
}
public static void main(String[] args) {
Company com=new Company();
com.operate();
com.report();
Manager m = new Manager();
m.manage();
m.conductMeeting();
Company company=new Manager();
System.out.println("Name of the Emp"+company.name);
}
}