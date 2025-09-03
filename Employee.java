class Employee {
static String name="Rahul";
static int id=1024;
static double salary=55000.75;
static String department="IT";
static boolean isPermanent=true;
public static void personName() {
System.out.println("Employee Name: " + name);
personNumber();
}
public static void personNumber() {
System.out.println("Employee number ID is : " + id);
personSalary();
}
public static void personSalary(){
System.out.println("Employee Salary in the company is : " + salary);
working();
}
public static void working() {
System.out.println("Employee working in the area is : " + department);
personStatus();
}
public static void personStatus() {
System.out.println("Employee Staus is : " + isPermanent);
}
public static void main(String[] args) {
personName(); 
}
}
