class Developer extends Employee 
{
public void offWork(){
System.out.println("Leave time ");
}
public static void main(String[] args){
Employee emp=new Developer();
emp.attendMeeting();
Developer devp=(Developer)emp;
devp.offWork();
Employee employee=new Manager();
employee.attendMeeting();
Manager mager=(Manager)employee;
mager.projectPlan();
System.out.println(devp instanceof Employee);
}
}