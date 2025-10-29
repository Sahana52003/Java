class Engineer extends Employee {
String dept = "Software";
double salary = 95000.50;
public void code() {
 System.out.println("Writing a code  and fix the bug"+dept + " Id of the emplloyee"+super.id); 
}
public void test() { 
super.logout();
System.out.println("testing the code"+super.dept+"with the salary "+salary); 
}
public static void main(String[] args) {
Employee emp=new Employee();
emp.login();
emp.logout();
Engineer e = new Engineer();
e.code();
e.test();
Employee empl=new Engineer();
System.out.println("Employee department "+empl.dept);
}
}