class College extends University {
String name = "Christ College";
double rating = 4.8;
public void teach() { 
System.out.println("Teachindg a concept to the students"+super.name+name); 
}
public void hostEvent() { 
System.out.println("Organised an event"+rating); 
}
public static void main(String[] args) {
University uni=new University();
uni.operate();
uni.research();
System.out.println("Number of faculties"+uni.faculties);
College c = new College();
c.teach();
c.hostEvent();
University unsity=new College();
System.out.println("Name of the University"+unsity.name);
}
}