class MollywoodMovies {
    public static void main(String[] args) {
        String[] movieNames = {"Drishyam", "Premam", "Bangalore Days", "Kumbalangi Nights",
            "Uyare", "Virus", "Charlie", "Take Off", "Angamaly Diaries", "Lucifer" };
        System.out.println("Mollywood Movies:");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println("Movie Name: " + movieNames[i]);
        }
        System.out.println("============================");
        for (String movie : movieNames) {
            System.out.println("Movie Name: " + movie);
        }
    }
}