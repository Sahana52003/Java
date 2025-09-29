class KollyHoodMovies {
    public static void main(String[] args) {
        String[] movieNames = {"Sivaji", "Mersal", "Master", "Vikram", "Kaithi", "Asuran", "Kabali",
            "Thuppakki", "Ghajini", "Ponniyin Selvan"};
        System.out.println("Kollywood Movies (using for loop):");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println("Movie Name: " + movieNames[i]);
        }
        System.out.println("=====================");
        for (String movie : movieNames) {
            System.out.println("Movie Name: " + movie);
        }
    }
}


