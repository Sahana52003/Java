class Teacher extends Person {
    public void teach() { 
System.out.println("Teaching concepts for students"); 
}
 public static void main(String[] args) {
        Person p = new Student();
        p.speak();
	Student stud=(Student)p;
	stud.study();
	Person person=new Teacher();
	person.speak();
        Teacher teacher=(Teacher)person;
	teacher.teach();
    }
}
