class Seminar extends Events
{
public void feedback(){
System.out.println("presenting sone info and the having feedback from others");
}
public static void main(String[] args){
Events event=new Seminar();
event.startEvent();
Seminar seminar=(Seminar)event;
seminar.feedback();
seminar.startEvent();
System.out.println(seminar instanceof Events);
System.out.println(event instanceof Seminar);
System.out.println(event instanceof Workshop);
Events eve=new Workshop();
eve.startEvent();
if(eve instanceof Workshop){
Workshop workshop=(Workshop)eve;
workshop.startEvent();
workshop.sessions();
}else{
System.out.println("Not a method");
}
}
}