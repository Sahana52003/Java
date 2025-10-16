class MathTeacher extends Teacher {
@Override 
public void planExam() { 
System.out.println("MathTeacher planning to give math exam");
 }
@Override 
public void attendance() {
 System.out.println("MathTeacher taking student attendance");
}
@Override
public void records(){
System.out.println("Update student detils");
}
}