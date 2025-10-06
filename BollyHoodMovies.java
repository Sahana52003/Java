class BollyHoodMovies {
    public static void main(String[] args) {
        String[] movieNames = {
            "Sholay", "Dilwale Dulhania Le Jayenge", "3 Idiots", "PK",
            "Lagaan", "Zindagi Na Milegi Dobara", "Dangal",

            "Gully Boy", "Chak De! India", "Kabir Singh"};
        System.out.println("Bollywood Movies :");
        for (int i = 0; i < movieNames.length; i++) {
            if (i<10) {
                System.out.println("Movie Name :" + movieNames[i]);
 		continue;
            }
                       
        }
        System.out.println("======================");
        for (String movie : movieNames) {
            System.out.println("Movie Name: " + movie);
        }
	if (movieNames.length < 6) {
            System.out.println("======================");
            System.out.println("There are less than 6 movies in the list.");
        } else {
            System.out.println("======================");
            System.out.println("There are " + movieNames.length + " movies in the list.");
}
    }


            "Gully Boy", "Chak De! India", "Kabir Singh"
        };

        System.out.println("Bollywood Movies (using for loop):");
        for (int i = 0; i < movieNames.length; i++) {
            if (i < 10) {  // valid check
                System.out.println("Movie Name: " + movieNames[i]);
                continue;
            }
        }

        System.out.println("======================");

        System.out.println("Bollywood Movies (using foreach loop):");
        for (String movie : movieNames) {
            System.out.println("Movie Name: " + movie);
        }

        // Example: check if array has at least 6 movies
        if (movieNames.length >= 6) {
            System.out.println("======================");
            System.out.println("Yes, there are " + movieNames.length + " movies in the list.");
        }
    }

}