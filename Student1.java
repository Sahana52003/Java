class Student1{
  static String name="JK";
  static  int age=21;
  static char x=67;
  static long phoneNumber=6734123896l;
  static double feesStructure=65897.54;
  static boolean isPassed=true;
public static void studentName(){
System.out.println("Student Name is " +name);
studentYears();
}
public static void studentYears(){
System.out.println("Student age is : " + age);
studentIdNumber();
}
public static void studentIdNumber(){
System.out.println("Studetn Id : " + x);
studentphoneNumber();
}
public static void studentphoneNumber(){
System.out.println("Student Mobile Number is : " + phoneNumber);
collegeFees();
}
public static void collegeFees(){
System.out.println("The College Fees Structure is : " + feesStructure);
yearPass();
}
public static void yearPass(){
System.out.println("The Student is Passed : " + isPassed);
}
public static void main(String [] args){
studentName();
}
}