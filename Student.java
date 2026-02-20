class Student extends School {
String name = "Alice";
double marks = 95.5;
public void study() { 
super.open();
System.out.println("Studying hard to get"+name+"To get a good marks"+marks);
 }
public void exam() { 
System.out.println("writing exam "+super.students+"Had scored"+marks); 
}
public static void main(String[] args) {
School sch=new School();
sch.open();
sch.close();
Student s = new Student();
s.study();
s.exam();
School school=new Student();
System.out.println("Name of the school"+school.name);
}
}