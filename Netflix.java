class Netflix 
{
public static int watchMovie(String movie, int rating) {
System.out.println("The Movie name is : " + movie + " And Its ratings are " + rating);
return 0;
}
public static void watchMovie(int quality,String subtitles) {
String movie="RRR";
if(movie=="RRR"&&subtitles=="telugu") {
System.out.println("The movies has a subtitle : " + subtitles);
}else {
System.out.println("Its has minimum subtitles ");
}
}
public static void watchMovie(boolean isPause,int addToList) {
System.out.println("is it paused " + isPause + " the favorite movie is added to " + addToList);
}
public static void main(String[] args) {
watchMovie("RRR",4);
watchMovie(720, "English");
watchMovie(true,1);
}
}
