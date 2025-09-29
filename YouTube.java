class YouTube 
{
public static void playVideo(String video,int numberOfShared) {
System.out.println("The Videos are " + video + " Total number of peoples shared the videos " + numberOfShared);
if(video=="Music"){
System.out.println("The videos are " + video);
}if(video=="Movies"||numberOfShared==45){
System.out.println("The videos are " + video + " shared " + numberOfShared);
}else if(video=="Cricket"){
System.out.println(video);
}
}
public static void playVideo(int likes,String languages) {
System.out.println("Languages are " + languages + " Likes for this videos " + likes);
}
public static int playVideo(boolean isDownload,String platform) {
System.out.println("is Successfully downloaded " + isDownload + " platforms avaliable to share " + platform);
return 0;
}
}

