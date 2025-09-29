class Spotify 
{
public static void playSong(String songName) {
System.out.println("The palyed SongName is .........." + songName);
}
public static void playSong(String artist,double followers) {
if(artist=="BTS"||followers!=567) {
System.out.println("NUmber of peoples are followed : " + followers);
}else if(artist=="V"||followers==23){ 
System.out.println("Artist not found");
}else {
System.out.println("Playing song by idol: " + artist + " and followers" + followers);
}
}
public static boolean playSong(double likes,boolean isAvaliable) {
System.out.println("Number of Liked song: " + likes + " Is this song is present in Spotify : " + isAvaliable);
return true;
}
public static void main(String[] args) {
playSong("My Universe");
playSong("BTS",1121);
playSong(345,true);
}
}
