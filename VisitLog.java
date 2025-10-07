class VisitLog 
{
char visitor;     
float visitDuration;      
String location;
boolean isVIP;
byte visitRating;         
public VisitLog() {
System.out.println("Visiting Log ");
}
public VisitLog(char visitor) {
visitor='U'; 
System.out.println("Visitor Initial: " + visitor);
}
public VisitLog(float visitDuration, boolean isVIP) {
System.out.println("Visit Duration for location : " + visitDuration + " VIP: " + isVIP);
}
public static void main(String[] args) {
VisitLog log = new VisitLog();
VisitLog log1 = new VisitLog('A');
VisitLog log2 = new VisitLog(2.5f, true);
log2.visitRating = 5;
System.out.println("Visit Rating: " + log2.visitRating);
TimeTable tt=new TimeTable();
TimeTable tt1 = new TimeTable("Nandu");
TimeTable tt2 = new TimeTable(7,true);
tt2.studyHours=60;
System.out.println(tt2.studyHours);
    }
}
