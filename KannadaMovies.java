class KannadaMovies {
    public static void main(String[] args) {
        String[] movieNames = {
            "KGF", "Kantara", "777Charlie", "Rajakumara", "Ugram",
            "Yuvarathnaa", "Bhajarangi", "Lucia", "KGF-2", "Kurukshetra"
        };
        System.out.println("Kannada Movies:");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println("Movie Name: " + movieNames[i]);
        }
	System.out.println("==============");
        for (String movie : movieNames) {
            System.out.println("Kannada Movie: " + movie);
        }
    }
}
