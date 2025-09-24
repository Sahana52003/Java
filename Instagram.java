class Instagram 
{
public static int postPhoto(String photo,String userName) {
System.out.println("The Instagram UserName is : " + userName + " and added profile " + photo);
return 0;
}
public static void postPhoto(String password,int viewStory) {
System.out.println("The user Password " + password + " The number of followers are view " + viewStory);
}
public static void postPhoto(boolean isAccount,double followers) {
System.out.println("The Number of Followers are " + followers + " Is Account is avaliable " + isAccount);
}
public static void main(String[] args) {
postPhoto("seven.png", "Sora_230031");
postPhoto("J7VST237",45);
postPhoto(true,1234);
}
}
