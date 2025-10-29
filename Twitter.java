class Twitter
{
public Twitter(){
}
public Twitter(String userName,char symbol){
System.out.println("The useName for twitter : " + userName + " and its symbol : " + symbol);
}
public static void main(String[] args){
new Twitter();
new Twitter("lavanya56",'A');
}
}