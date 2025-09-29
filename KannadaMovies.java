class KannadaMovies {
    public static void main(String[] args) {
        String[] movieNames = {
            "KGF", "Kantara", "777Charlie", "Rajakumara", "Ugram",
            "Yuvarathnaa", "Bhajarangi", "Lucia", "KGF-2", "Kurukshetra"
        };
       String[] movie={ "Yuvarathnaa", "Bhajarangi", "Lucia", "KGF-2", "Kurukshetra"};
        System.out.println("Kannada Movies:");
        for (int i = 0; i < movieNames.length; i++) {
            if (i<5) {
                System.out.println("Movie Name :" + movieNames[i]);
 		continue;
            }
        }
        System.out.println("======================");
        for (String moviee : movie) {
            System.out.println("Movie Name: " + movie);
        }
	if (movie.length <10) {
            System.out.println("======================");
            System.out.println("There are less than 6 movies in the list. : " + movie.length);
        } else {
            System.out.println("======================");
            System.out.println("There are " + movie.length + " movies in the list.");
}
    }

}
