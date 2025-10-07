class TimeTable
 {
String studentName;
int numberOfCourse;
boolean isFinalized;
double averageHours = 3.5;
long studyHours = 120;
public TimeTable() {
System.out.println("Timetable is created");
}
public TimeTable(String studentName) {
studentName="Ram";
System.out.println("student name " + studentName);
}
public TimeTable(int numberOfCourse, boolean isFinalized) {
System.out.println("Number of courses: " + numberOfCourse + "Finalized: " + isFinalized);
}
public static void main(String[] args) {
TimeTable tt = new TimeTable();
TimeTable tt1 = new TimeTable("Alex");
TimeTable tt2 = new TimeTable(5, false);
tt2.averageHours=5.5;
System.out.println("Average Hours Per Course: " + tt2.averageHours);
System.out.println("Total Study Hours: " + tt2.studyHours);
    }
}
