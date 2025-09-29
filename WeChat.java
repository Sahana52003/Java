class WeChat
{
public WeChat(){
}
public WeChat(String message,long phoneNumber){
System.out.println("Sending messages : " + message + " to this mobile number : " + phoneNumber);
}
public static void main(String[] args){
new WeChat();
new WeChat("Hello",7829538619l);
}
}