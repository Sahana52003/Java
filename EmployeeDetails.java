class EmployeeDetails
{
static byte experienceYears = 5;      
static short empDeptCode = 101;      
static int empID = 1024;               
static long phoneNumber = 9876543210L;  
static float salaryPerHour = 550.75f;  
static double totalSalary = 250000.99; 
static char grade = 'B';               
static boolean isActive = true;         
static String name = "John";            
static String[] skills = {"Java", "SQL", "Azure DevOps"}; 
public static void main(String[] args){
byte experienceYears = 3;      
short empDeptCode = 415;      
int empID = 1097;               
long phoneNumber = 4572331267L;  
float salaryPerHour = 56.95f;  
double totalSalary = 45000.45; 
char grade = 'A';               
boolean isActive = false;         
String name = "Tim";            
String[] skills = {"Python", "MYSQL", "HTML","CSS"}; 
System.out.println("===== Employee Details =====");
System.out.println("Name of Employee: " + name);
System.out.println("Total Experience of Employee : " + experienceYears);
System.out.println("Department Code: " + empDeptCode);
System.out.println("Employee ID: " + empID);
System.out.println("Phone Number: " + phoneNumber);
System.out.println("Salary per Hour: " + salaryPerHour);
System.out.println("Total Salary: " + totalSalary);
System.out.println("Grade: " + grade);
System.out.println("Active: " + isActive);
}
}

