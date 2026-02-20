class Festival {
public Festival() {
this("Diwali");
System.out.println("celebrating Festival ");
}
public Festival(String name) {
this("November",2025);
System.out.println("Festival Name is : "+name);
}
public Festival(String month,int year) {
System.out.println("Celebrating in the year : " + year + " And month : "+month);
}
}