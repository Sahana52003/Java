class Parent
{
public Parent(){
this("Ram");
System.out.println("NO arguments ");
}
public Parent(String name){
this(23,"Raj");
System.out.println("Name is :" + name);
}
public Parent(int age,String nickName ){
System.out.println("Parent age is : " + age + "and have a nickname : " + nickName );
}
}