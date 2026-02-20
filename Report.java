class Report extends Document
{
public void writeSummary(){
System.out.println("Writing some iformatio");
}
public void convertToPDF(){
System.out.println("can convert ot pdf ,word.....");
}
public static void main(String[] args){
Document doc=new Report();
doc.opened();
doc.closed();
Report rep=(Report)doc;
rep.writeSummary();
rep.convertToPDF();
System.out.println(rep instanceof Report);
}
}