class BollyHoodMovies {
    public static void main(String[] args) {
        String[] movieNames = {
            "Sholay", "Dilwale Dulhania Le Jayenge", "3 Idiots", "PK",
            "Lagaan", "Zindagi Na Milegi Dobara", "Dangal",
            "Gully Boy", "Chak De! India", "Kabir Singh"};
        System.out.println("Bollywood Movies :");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println("Movie Name: " + movieNames[i]);
        }
        System.out.println("======================");
        for (String movie : movieNames) {
            System.out.println("Movie Name: " + movie);
        }
    }
}
